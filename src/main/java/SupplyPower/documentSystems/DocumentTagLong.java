package SupplyPower.documentSystems;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

/**
 * Created by redolyr on 2016/08/10.
 */
public class DocumentTagLong extends DocumentBasePrimitive {

    private long data;

    protected DocumentTagLong() {
    }

    public DocumentTagLong(long data) {
        this.data = data;
    }

    void write(Document par1, Element par2) throws ParserConfigurationException, TransformerException, SAXException, DOMException {
        par2.setTextContent(this.data + "");
    }

    void read(Document par1, Element par2) throws ParserConfigurationException, TransformerException, SAXException, DOMException {
        this.data = Long.parseLong(par2.getTextContent());
    }

    public byte getId() {
        return 7;
    }

    public DocumentTagLong copy() {
        return new DocumentTagLong(this.data);
    }

    public int toInteger() {
        return (int) (this.data & -1L);
    }

    public short toShort() {
        return (short) (this.data & 65535L);
    }

    public long toLong() {
        return this.data;
    }

    public byte toByte() {
        return (byte) (this.data & 255L);
    }

    public double toDouble() {
        return (double) this.data;
    }

    public float toFloat() {
        return (float) this.data;
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof DocumentTagLong)) return false;

        return this.data == ((DocumentTagLong) o).data;
    }

    public String toString() {
        return String.valueOf(this.toLong());
    }
}