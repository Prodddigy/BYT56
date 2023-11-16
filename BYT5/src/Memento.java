public class Memento {
    public Minifigure getMinifigure() {
        return minifigure;
    }

    private Minifigure minifigure;
    private String head;
    private String torso;
    private String legs;
    private String accessory;

    public Memento(Minifigure minifigure, String head, String torso, String legs, String accessory)
    {
        this.minifigure = minifigure;
        this.head = head;
        this.torso = torso;
        this.legs = legs;
        this.accessory = accessory;

    }

    public void restore()
    {
        minifigure.setHead(head);
        minifigure.setLegs(legs);
        minifigure.setTorso(torso);
        minifigure.setAccessory(accessory);
    }
    /*

    // At some point, a previous state of the editor can be
    // restored using a memento object.
    method restore() is
        editor.setText(text)
        editor.setCursor(curX, curY)
        editor.setSelectionWidth(selectionWidth)

// A command object can act as a caretaker. In that case, the
// command gets a memento just before it changes the
// originator's state. When undo is requested, it restores the
// originator's state from a memento.
     */
}
