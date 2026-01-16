//import com.jcraft.jsch.*;
//import java.io.*;
//
//public class ConnectToPuttySession {
//
//    public static void puttyConnection(String host, String userName, String password, String path, String cmd)
//            throws JSchException, IOException, InterruptedException, SQLException {
//        Session session = new JSch().getSession(userName, host, 22);
//        session.setPassword(password);
//
//        java.util.Properties config = new java.util.Properties();
//        config.put("StrictHostKeyChecking", "no");
//        session.setConfig(config);
//        session.connect();
//
//        Channel channel = session.openChannel("shell");
//        OutputStream ops = channel.getOutputStream();
//        channel.connect();
//
//        try (PrintStream ps = new PrintStream(ops, true)) {
//            ps.println("cd " + path);
//            ps.println(cmd);
//        }
//
//        try (InputStream input = channel.getInputStream()) {
//            printResult(input, channel);
//        }
//
//        channel.disconnect();
//        session.disconnect();
//    }
//
//    private static void printResult(InputStream input, Channel channel) throws Exception {
//        final int SIZE = 1024;
//        boolean foundResult = false;
//        boolean promptDetected = false;
//        StringBuilder logsForReport = new StringBuilder();
//        byte[] buffer = new byte[SIZE];
//
//        Thread.sleep(10000); // Wait for the command to finish (could be improved)
//
//        while (channel.isConnected()) {
//            while (input.available() > 0) {
//                int bytesRead = input.read(buffer, 0, SIZE);
//                if (bytesRead < 0) break;
//                String chunk = new String(buffer, 0, bytesRead);
//
//                Reporter.log(chunk, true);
//                logsForReport.append("\n").append(chunk);
//
//                if (chunk.contains("SUCCESS") || chunk.contains("Exited") || chunk.contains("FAILURE")) {
//                    foundResult = true;
//                }
//                if (chunk.contains("Successful! Exited without errors.")) {
//                    Reporter.log("status " + channel.getExitStatus() + " message->" + chunk, true);
//                } else if (chunk.contains("Invalid") || chunk.contains("Exited with errors.") || chunk.contains("Exited with unknown status:")) {
//                    Reporter.log("status " + channel.getExitStatus(), true);
//                }
//            }
//            // Check for shell prompt at the end
//            if (logsForReport.toString().endsWith("bin]$ ")) {
//                promptDetected = true;
//            }
//
//            if (channel.isClosed()) {
//                Reporter.log("exit-status: " + channel.getExitStatus(), true);
//                break;
//            }
//
//            if (foundResult && promptDetected) {
//                Fn_ErTestCaseStatusReport(constants.complianceStudioConstants.ReportConstants.INFO, "Successful! Exited without errors.");
//                Reporter.log(logsForReport.toString(), true);
//                channel.disconnect();
//                break;
//            } else if (promptDetected) {
//                Fn_TestCaseStatusReport(constants.complianceStudioConstants.ReportConstants.FAIL, "Check IDE console for logs!");
//                Reporter.log(logsForReport.toString(), true);
//                channel.disconnect();
//                break;
//            }
//        }
//    }
//}
