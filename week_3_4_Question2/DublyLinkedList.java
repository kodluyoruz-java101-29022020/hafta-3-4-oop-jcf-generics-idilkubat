package week_3_4_Question2;

public class DublyLinkedList {
	
	protected Node start;
    protected Node end;
    public int size;
	
	public void insertAtStart(int value) {
		
		Node node = new Node(value, null, null);		//Baslangıc degerimizi için düğüm oluşturuyoruz
		if(start==null) {	//baslangıçta hiç değer yoksa başlangıç ve son değer eklediğimiz değer olur
			start = node;
            end = start;
		}
		
		else {
			start.setPrev(node);  //eğer başlangıçta başka değer varsa bir kaydırılarak öncesi yeni eklediğimiz değer olur
			node.setNext(start);  //yeni eklediğimiz değerin sonrasındaki değer de başlangıçtaki değer olur
			start = node;		  //artık başlangıç değerimiz yeni eklediğimiz değer olur
		}
		size++;
	}
	
	
	public void insertAtEnd(int value) {
		Node node = new Node(value, null, null);	//Son değerimiz için düğüm oluşturuyoruz
		if (start == null) {
            start = node;
            end = start;
        } 
		else {
        	node.setPrev(end);      //eklediğimiz değerin bir öncesi sondaki değer olur
            end.setNext(node);		//sondaki değerin bir sonrası eklediğimiz değer olur
            end = node;				//sondaki değer eklediğimiz değer olur
        }
        size++;
	}
	
	public void insertAtPos(int value, int pos) {  //aralara değer eklemek için pozisyon ve değeri aldık
		Node node = new Node(value, null, null);
		if (pos == 1) {
            insertAtStart(value);
            return;
        }
		Node value2 = start;
		for (int i = 2; i <= size; i++) {
            if (i == pos) {
                Node tmp = value2.getNext();
                value2.setNext(node);
                node.setPrev(value2);
                node.setNext(tmp);
                tmp.setPrev(node);
            }
            value2 = value2.getNext();
        }
        size++;
	}
	
	public void deleteAtPos(int pos) {
		if (pos == 1) {
            if (size == 1) {		//eğer baştan eleman silmek istersem
                start = null;
                end = null;
                size = 0;
                return;
            }
            start = start.getNext();
            start.setPrev(null);
            size--;
            return;
        }
		
		if (pos == size) {  //sondan eleman silmek istersem
            end = end.getPrev();
            end.setNext(null);
            size--;
        }
		
		Node ptr = start.getNext();
        for (int i = 2; i <= size; i++) {
            if (i == pos) {
                Node p = ptr.getPrev();
                Node n = ptr.getNext();
 
                p.setNext(n);
                n.setPrev(p);
                size--;
                return;
            }
            ptr = ptr.getNext();
        }
		
	}
	
	public void showValues() {  //eklenen değerleri göstermek için  fonksiyon oluşturuyoruz
		if(size == 0) { //değer eklenmediyse
			System.out.println("Empty");
			return;
		}
		if(start.getNext()==null) {   //sadece bir değer varsa (next==null oluyor)
			System.out.println(start.getValue());
			return;
		}
		
		Node value2 = start;
		System.out.print(start.getValue()+ "---");
		value2 = start.getNext();	//başlangıç değerimizin next ini yedek bir değerde tutuyoruz
		while(value2.getNext() != null) {
			System.out.print(value2.getValue()+ "---");
			value2 = value2.getNext();
		}
		System.out.print(value2.getValue() + "\n");
	}
}
