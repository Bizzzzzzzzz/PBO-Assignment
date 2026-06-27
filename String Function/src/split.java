public class split {
    public static void main(String[] args) {
        String data = "thewalker,ilovedogs,ilovecats";
        String[] listUsername = data.split(",");
        for (int i = 0; i < listUsername.length; i++ ) {
            System.out.println(listUsername[i]);   
        }
    }
}