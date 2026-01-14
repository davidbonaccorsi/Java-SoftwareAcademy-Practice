package rest.exercise;

public class CloadServerLoadBalancer {

    static int requests = 5;
    static long serverId = 10;
    static double cpuUsage = 40.5;
    static boolean isMaintenanceMode = false;

    static double systemLoad = cpuUsage + serverId + ++requests;
    static boolean isServerHealthy =  ((!isMaintenanceMode && systemLoad < 60) || serverId%2==0);

    static String action = (isServerHealthy ? (requests>10 ? "Scale up" : "Stay stable") : (isMaintenanceMode ? "Manual restart" : "Auto restart") );

    public static void main(String[] args) {
        System.out.println("Server: " + serverId + " | Load: " + systemLoad + " | Action: " + action);
    }
}
