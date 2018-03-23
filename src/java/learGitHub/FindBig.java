package learGitHub;

public class FindBig {

    public void findBigest(int[] list){
        int temp = 0;
        for (int i = 0;i<list.length;i++){
            if(list[i] > temp) {
                temp = list[i];
            }
        }
        System.out.println(temp);
    }
}
