
public class Player {
    private String move;
    
    public Player(String move) {
        this.move = move;
    }
    
    public String getMove(){
        return this.move;
    }
    
    public void changeMove(String move){
        this.move = move;
    }
}
