package database;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author tharindulakshan
 */
public class OpenPDF {

    public static void openByID_MacOS(String id) {
        try {
            //FileUtils.filePath + 
            File pdfFile = new File(FileUtils.filePath + id + ".pdf");

            if (pdfFile.exists()) {

                ProcessBuilder pb = new ProcessBuilder("open", pdfFile.getAbsolutePath());
                pb.directory(new File(FileUtils.filePath));
                pb.start();

            } else {

                System.out.println("PDF file does not exist: " + pdfFile.getAbsolutePath());

            }
        } catch (Exception e) {

            System.out.println("OpenPDF error: " + e);

        }
    }

    public static void openByID_Windows(String id) {
        try {
            File pdfFile = new File(FileUtils.filePath + id + ".pdf");

            if (pdfFile.exists()) {
                
                Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + pdfFile.getAbsolutePath());
                
            } else {
                JOptionPane.showMessageDialog(null, "File does not exist: " + pdfFile.getAbsolutePath());
            }
        } catch (Exception e) {
            System.out.println("OpenPDF error: " + e);
        }
    }

}
