import atividade.HelloMaster;

public class Main{

    public static void main(String[] args) {
        int cpu_threads = Runtime.getRuntime().availableProcessors();
        HelloMaster hm = new HelloMaster(cpu_threads*2);
        hm.letsGetSomeHellos();
    }
}