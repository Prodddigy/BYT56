public class Minifigure {

    private String head;
    private String torso;
    private String legs;
    private String accessory;

    public Minifigure() {

    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getTorso() {
        return torso;
    }

    public void setTorso(String torso) {
        this.torso = torso;
    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public Memento saveMinifigure()
    {
        return new Memento(this,head,torso,legs,accessory);
    }
/*


    // Saves the current state inside a memento.
    method createSnapshot():Snapshot is
    // Memento is an immutable object; that's why the
    // originator passes its state to the memento's
    // constructor parameters.
        return new Snapshot(this, text, curX, curY, selectionWidth)

// The memento class stores the past state of the editor.

 */
}
