package classes;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import database.FileUtils;
import database.MyConnection;
import database.OpenPDF;
import java.awt.Color;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author tharindulakshan
 */
public class Order {

    private int orderPK;
    private String orderID;
    private String customerName;
    private String customerMobileNumber;
    private String orderDate;
    private double totalPaidAmount;

    public int getOrderPK() {
        return orderPK;
    }

    public void setOrderPK(int orderPK) {
        this.orderPK = orderPK;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerMobileNumber() {
        return customerMobileNumber;
    }

    public void setCustomerMobileNumber(String customerMobileNumber) {
        this.customerMobileNumber = customerMobileNumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalPaidAmount() {
        return totalPaidAmount;
    }

    public void setTotalPaidAmount(double totalPaidAmount) {
        this.totalPaidAmount = totalPaidAmount;
    }

    public String generateOrderID(String orderID) {

        return orderID + System.nanoTime();

    }

    public void updateQuantity(int quantity, String productID) {

        String sql = "UPDATE tblProduct SET quantity=quantity-? WHERE productID=?";

        try {

            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            MyConnection.pst.setInt(1, quantity);
            MyConnection.pst.setString(2, productID);
            MyConnection.pst.executeUpdate();

        } catch (Exception e) {

            System.out.println("updateQuantity Function Error: " + e);

        }

    }

    public String getBillDate() {

        SimpleDateFormat myDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();

        String time = myDateFormat.format(cal.getTime());

        return time;

    }

    public void createOrder() {

        String sql = "INSERT INTO tblOrder(orderID,customerName,customerMobileNumber,orderDate,totalPaidAmount) VALUES(?,?,?,?,?)";

        try {

            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);

            MyConnection.pst.setString(1, orderID);
            MyConnection.pst.setString(2, customerName);
            MyConnection.pst.setString(3, customerMobileNumber);

            orderDate = getBillDate();

            MyConnection.pst.setString(4, orderDate);
            MyConnection.pst.setDouble(5, totalPaidAmount);

            MyConnection.pst.executeUpdate();

        } catch (Exception e) {

            System.out.println("createOrder Function Error: " + e);

        }

    }

    public void createBillPDF(String items[][]) {

        com.itextpdf.text.Document doc = new com.itextpdf.text.Document();

        try {

            PdfWriter.getInstance(doc, new FileOutputStream(FileUtils.filePath + "" + orderID + ".pdf"));
            doc.open();
            Paragraph projectName = new Paragraph("                                          Mobile Phone shop Inventory Management System\n");
            doc.add(projectName);

            Paragraph starLine = new Paragraph("****************************************************************************************************************");
            doc.add(starLine);

            Paragraph details = new Paragraph("\tOrder ID: " + orderID + "\nDate: " + orderDate + "\nTotal Paid: " + totalPaidAmount);
            doc.add(details);
            doc.add(starLine);

            PdfPTable tbl = new PdfPTable(4);

            PdfPCell nameCell = new PdfPCell(new Phrase("Name"));
            PdfPCell priceCell = new PdfPCell(new Phrase("Unit Price"));
            PdfPCell quantityCell = new PdfPCell(new Phrase("Quantity"));
            PdfPCell subTotalPrice = new PdfPCell(new Phrase("Sub Total Price"));

            BaseColor backgroundColor = new BaseColor(Color.blue);
            nameCell.setBackgroundColor(backgroundColor);
            priceCell.setBackgroundColor(backgroundColor);
            quantityCell.setBackgroundColor(backgroundColor);
            subTotalPrice.setBackgroundColor(backgroundColor);

            tbl.addCell(nameCell);
            tbl.addCell(priceCell);
            tbl.addCell(quantityCell);
            tbl.addCell(subTotalPrice);

            if (items[0][1] == null) {
                System.out.println("ITEMS EMPTY IN CART ARRAY CHECH AGAIN!");
            } else {

                for (String[] row : items) {
                 
                    for (String value : row) {
                        
                        tbl.addCell(value);
                        
                    }
                    
                }
                
                doc.add(tbl);
                doc.add(starLine);
                Paragraph message = new Paragraph("Thank you! Please visit again!");
                doc.add(message);
                OpenPDF.openByID_MacOS(orderID);

            }

        } catch (Exception e) {

            System.out.println("createBillPDF Function Error: " + e);

        }

        doc.close();

    }
    

}
