public class FavoriteFood {
    public void foodOne(){
        System.out.println("나는 갓비큐를 좋아함.");
    }
    public void foodTwo(String food){
        System.out.println("나는 "+ food + "를 좋아함.");
    }
    public String foodThree(){
        return "나는 갓비큐를 좋아함.";
    }
    public String foodFour(String food, int count){
        return "나는 " + food + " " + count + " 마리 먹는 거 좋아함.";
    }
}
