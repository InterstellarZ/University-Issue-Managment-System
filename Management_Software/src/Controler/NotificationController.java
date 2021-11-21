package Controler;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;

public class NotificationController {

    public class IssueNotification {

        public String host = "localhost";
        public String from = "tutora.academy.colombo@gmail.com";
        public String content;
        public String subject;

        public void StudentRegnotification(String To, String name, String IT) {

            subject = "Your registration issue has been successfully submitted";

            content = "Dear " + name + ",\n"
                    + "\n"
                    + "Your registration issue has been successfully submitted and we'll get back to you within 3-5 business days.\n"
                    + "_____________\n"
                    + "\n"
                    + "If you have any other issues related to student affairs, please contact the student affairs division of the Tutora Educational Institute.\n"
                    + "\n"
                    + "_____________\n"
                    + "\n"
                    + "Student Affairs Division:\n"
                    + "email : tutoraeducationalinstitute.studentaffairs@gmail.com\n"
                    + "\n"
                    + "If it’s an urgent inquiry, please contact us on the below contact numbers within 8.30 a.m. to 05.00 p.m. on working weekdays: \n"
                    + "\n"
                    + "phone : 011258945236";

            Properties p = new Properties();
            p.put("mail.smtp.auth", "true");
            p.put("mail.smtp.starttls.enable", "true");
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.put("mail.smtp.port", "587");

            Session s = Session.getDefaultInstance(p, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("tutora.academy.colombo@gmail.com", "Tutoratutora1");
                }

            });

            try {
                MimeMessage m = new MimeMessage(s);
                m.setFrom(from);
                m.addRecipient(Message.RecipientType.TO, new InternetAddress(To));
                m.setSubject(subject);
                m.setText(content);
                Transport.send(m);
                System.out.println("Sucess");

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Your email is invalid.Please type a valid email", "Output", 1);
            }

        }

        //-------------------------------------------------------------------
        public void ExamIssueNotification(String To, String name, String IT) {

            subject = "Your Examination issue has been successfully submitted";

            content = "Dear " + name + ",\n"
                    + "\n"
                    + "Your Examination issue has been successfully submitted and we'll get back to you within 3-5 business days.\n"
                    + "_____________\n"
                    + "\n"
                    + "If you have any other issues related to student affairs, please contact the student affairs division of the Tutora Educational Institute.\n"
                    + "\n"
                    + "_____________\n"
                    + "\n"
                    + "Student Affairs Division:\n"
                    + "email : tutoraeducationalinstitute.studentaffairs@gmail.com\n"
                    + "\n"
                    + "If it’s an urgent inquiry, please contact us on the below contact numbers within 8.30 a.m. to 05.00 p.m. on working weekdays: \n"
                    + "\n"
                    + "phone : 011258945236";

            Properties p = new Properties();
            p.put("mail.smtp.auth", "true");
            p.put("mail.smtp.starttls.enable", "true");
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.put("mail.smtp.port", "587");

            Session s = Session.getDefaultInstance(p, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("tutora.academy.colombo@gmail.com", "Tutoratutora1");
                }

            });

            try {
                MimeMessage m = new MimeMessage(s);
                m.setFrom(from);
                m.addRecipient(Message.RecipientType.TO, new InternetAddress(To));
                m.setSubject(subject);
                m.setText(content);
                Transport.send(m);
                System.out.println("Sucess");

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Your email is invalid.Please type a valid email", "Output", 1);
            }

        }

        //-------------------------------------------------------------------------------------------------------------------------
        public void ExamInquiriesNotification(String To, String name, String IT, String type) {

            subject = "Your " + type + " has been successfully submitted";

            content = "Dear " + name + ",\n"
                    + "\n"
                    + "Your " + type + " issue has been successfully submitted and we'll get back to you within 3-5 business days.\n"
                    + "_____________\n"
                    + "\n"
                    + "If you have any other issues related to student affairs, please contact the student affairs division of the Tutora Educational Institute.\n"
                    + "\n"
                    + "_____________\n"
                    + "\n"
                    + "Student Affairs Division:\n"
                    + "email : tutoraeducationalinstitute.studentaffairs@gmail.com\n"
                    + "\n"
                    + "If it’s an urgent inquiry, please contact us on the below contact numbers within 8.30 a.m. to 05.00 p.m. on working weekdays: \n"
                    + "\n"
                    + "phone : 011258945236";

            Properties p = new Properties();
            p.put("mail.smtp.auth", "true");
            p.put("mail.smtp.starttls.enable", "true");
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.put("mail.smtp.port", "587");

            Session s = Session.getDefaultInstance(p, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("tutora.academy.colombo@gmail.com", "Tutoratutora1");
                }

            });

            try {
                MimeMessage m = new MimeMessage(s);
                m.setFrom(from);
                m.addRecipient(Message.RecipientType.TO, new InternetAddress(To));
                m.setSubject(subject);
                m.setText(content);
                Transport.send(m);
                System.out.println("Sucess");

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Your email is invalid.Please type a valid email", "Output", 1);
            }

        }

        public void EmployerNotification(String To, String ID, String name, String type, String comment) {

            subject = "Your " + type + " has been solved";

            try {
                content = "Dear Student,\n"
                        + "\n"
                        + "Name: " + name + "\n"
                        + "IT number/ID number:" + ID + "\n"
                        + "\n"
                        + "Your " + type + " has been solved. \n"
                        + "\n"
                        + "More details:\n"
                        + "\n" + comment + "\n"
                        + "\n"
                        + "_____________\n"
                        + "\n"
                        + "If you have any other issues related to student affairs, please contact the student affairs division of the Tutora Educational Institute.\n"
                        + "_____________\n"
                        + "\n"
                        + "Student Affairs Division:\n"
                        + "Email : tutoraeducationalinstitute.studentaffairs@gmail.com\n"
                        + "\n"
                        + "If it’s an urgent inquiry, please contact us on the below contact numbers within 8.30 a.m. to 05.00 p.m. on working weekdays: \n"
                        + "\n"
                        + "Phone : 011258945236";

            } catch (Exception ex) {
                ex.getMessage();
            }

            Properties p = new Properties();
            p.put("mail.smtp.auth", "true");
            p.put("mail.smtp.starttls.enable", "true");
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.put("mail.smtp.port", "587");

            Session s = Session.getDefaultInstance(p, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("tutora.academy.colombo@gmail.com", "Tutoratutora1");
                }

            });

            try {
                MimeMessage m = new MimeMessage(s);
                m.setFrom(from);
                m.addRecipient(Message.RecipientType.TO, new InternetAddress(To));
                m.setSubject(subject);
                m.setText(content);
                Transport.send(m);
                System.out.println("Sucess");

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Your email is invalid.Please type a valid email", "Output", 1);
            }

        }

        public void PasswordResetNotification(String name, String To, String nic, String id, String type, String admin, String comment) {

            subject = "A user has requested to reset the password";

            try {

                content = "User Type: " + type + "\n"
                        + "User ID: " + id + "\n"
                        + "NIC number: " + nic + "\n"
                        + "Full Name: " + name + "\n"
                        + "Email: " + To + "\n"
                        + "Details: " + comment + "";

            } catch (Exception ex) {
                ex.getMessage();
            }

            Properties p = new Properties();
            p.put("mail.smtp.auth", "true");
            p.put("mail.smtp.starttls.enable", "true");
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.put("mail.smtp.port", "587");

            Session s = Session.getDefaultInstance(p, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("tutora.academy.colombo@gmail.com", "Tutoratutora1");
                }

            });

            try {
                MimeMessage m = new MimeMessage(s);
                m.setFrom(from);
                m.addRecipient(Message.RecipientType.TO, new InternetAddress(To));
                m.setSubject(subject);
                m.setText(content);
                Transport.send(m);
                System.out.println("Sucess");

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Your email is invalid.Please type a valid email", "Output", 1);
            }

        }

        public void ForgetPasswordNotification(String name, String To, String nic, String id, String type, String admin, String comment) {

            subject = "A User Has Requested to Create a New Password ";

            try {

                content = "User Type: " + type + "\n"
                        + "User ID: " + id + "\n"
                        + "NIC number: " + nic + "\n"
                        + "Full Name: " + name + "\n"
                        + "Email: " + To + "\n"
                        + "Details: " + comment + "";

            } catch (Exception ex) {
                ex.getMessage();
            }

            Properties p = new Properties();
            p.put("mail.smtp.auth", "true");
            p.put("mail.smtp.starttls.enable", "true");
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.put("mail.smtp.port", "587");

            Session s = Session.getDefaultInstance(p, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("tutora.academy.colombo@gmail.com", "Tutoratutora1");
                }

            });

            try {
                MimeMessage m = new MimeMessage(s);
                m.setFrom(from);
                m.addRecipient(Message.RecipientType.TO, new InternetAddress(To));
                m.setSubject(subject);
                m.setText(content);
                Transport.send(m);
                System.out.println("Sucess");

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Your email is invalid.Please type a valid email", "Output", 1);
            }

        }

    }

}
