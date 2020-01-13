public class main {
	
	public String Author;
	public String Book;
	public String Chapter;
	public String subChapter;
	public int Paragraph;
	public String Image;
	public String Table;
	
	public main(String A, String B, String C, String sC, int P, String I, String T)
	{
		this.Author = A;
		this.Book = B;
		this.Chapter = C;
		this.subChapter = sC;
		this.Image = I;
		this.Table = T;
	}
	
	public static void main(String [] args) throws Exception 
	{
//		Book onEarth = new Book ("On Earth");
//		Author pAndrei = new Author ("Porcarin Andrei");
//		onEarth.addAuthor(pAndrei);
//		int indexOfChapter = onEarth.createChapter("Chapter One");
//		Chapter chOne = onEarth.getChapter(indexOfChapter);
//		int indexOfSubChapter = chOne.createSubChapterList("Chapter One One");
//		subChapter chOneOne = chOne.getSubChapter(indexOfSubChapter);
//		int indexOfParagraph = chOneOne.createParagraphList("Paragraph 1");
//		int indexOfImage = chOneOne.createImageList("Image 1");
//		int indexOfParagraph2 = chOneOne.createParagraphList("Paragraph 2");
//		int indexOfParagraph3 = chOneOne.createParagraphList("Paragraph 3");
//		int indexOfTable = chOneOne.createTableList("Table 1");
//		onEarth.print();
		
//		Book noapteBuna = new Book("Noapte buna, copii!");
//		Author rpGheo = new Author("Radu Pavel Gheo");
//		noapteBuna.addAuthor(rpGheo);
//		
//		Section cap1 = new Section("Capitolul 1");
//		Section cap11 = new Section("Capitolul 1.1");
//		Section cap111 = new Section("Capitolul 1.1.1");
//		Section cap1111 = new Section("Capitolul 1.1.1.1");
//		noapteBuna.addContent(new Paragraph("Multumesc celor prezenti!"));
//		noapteBuna.addContent(cap1);
//		cap1.add(new Paragraph("Moto capitol"));
//		cap1.add(cap11);
//		cap11.add(new Paragraph("Text from subchapter 1.1"));
//		cap11.add(cap111);
//		cap111.add(new Paragraph("Text from subchapter 1.1.1"));
//		cap111.add(cap1111);
//		cap1111.add(new Paragraph("Image from subchapter 1.1.1.1"));
//		noapteBuna.print();
		
//		long startTime = System.currentTimeMillis();
//		Image img1 = new Image("Pamela Anderson");
//		Image img2 = new Image("Kim Kardashian");
//		Image img3 = new Image("Kirby Griffin");
//		Section playboyS1 = new Section("Front Cover");
//		playboyS1.add(img1);
//		Section playboyS2 = new Section("Summer Girls");
//		playboyS2.add(img2);
//		playboyS2.add(img3);
//		Book playboy = new Book("Playboy");
//		playboy.addContent(playboyS1);
//		playboy.addContent(playboyS2);
//		long endTime = System.currentTimeMillis();
//		System.out.println("Creation of the content took " + (endTime -
//		startTime) + " milliseconds");
//		startTime = System.currentTimeMillis();
//		playboyS1.print();
//		endTime = System.currentTimeMillis();
//		System.out.println("Printing of the section 1 took " + (endTime -
//		startTime) + " milliseconds");
//		startTime = System.currentTimeMillis();
//		playboyS1.print();
//		endTime = System.currentTimeMillis();
//		System.out.println("Printing again the section 1 took " + (endTime -
//		startTime) + " milliseconds");
		
//		long startTime = System.currentTimeMillis();
//		ImageProxy img1 = new ImageProxy("Pamela Anderson");
//		ImageProxy img2 = new ImageProxy("Kim Kardashian");
//		ImageProxy img3 = new ImageProxy("Kirby Griffin");
//		Section playboyS1 = new Section("Front Cover");
//		playboyS1.add(img1);
//		Section playboyS2 = new Section("Summer Girls");
//		playboyS2.add(img2);
//		playboyS2.add(img3);
//		Book playboy = new Book("Playboy");
//		playboy.addContent(playboyS1);
//		playboy.addContent(playboyS2);
//		long endTime = System.currentTimeMillis();
//		System.out.println("Creation of the content took " + (endTime -
//		startTime) + " milliseconds");
//		startTime = System.currentTimeMillis();
//		playboyS1.print();
//		endTime = System.currentTimeMillis();
//		System.out.println("Printing of the section 1 took " + (endTime -
//		startTime) + " milliseconds");
//		startTime = System.currentTimeMillis();
//		playboyS1.print();
//		endTime = System.currentTimeMillis();
//		System.out.println("Printing again the section 1 took " + (endTime -
//		startTime) + " milliseconds");
		
//		Section cap1 = new Section("Capitolul 1");
//		Paragraph p1 = new Paragraph("Paragraph 1");
//		cap1.add(p1);
//		Paragraph p2 = new Paragraph("Paragraph 2");
//		cap1.add(p2);
//		Paragraph p3 = new Paragraph("Paragraph 3");
//		cap1.add(p3);
//		Paragraph p4 = new Paragraph("Paragraph 4");
//		cap1.add(p4);
//		System.out.println("Printing without Alignment");
//		System.out.println();
//		cap1.print();
//		p1.setAlignStrategy(new CenterStrategy());
//		p2.setAlignStrategy(new RightStrategy());
//		p3.setAlignStrategy(new LeftStrategy());
//		System.out.println();
//		System.out.println("Printing with Alignment");
//		System.out.println();
//		cap1.print();
		
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));
		BookStatistics stats = new BookStatistics();
		cap1.accept(stats);
		stats.printStatistics();
		
	}

	public String getAuthor()
	{
		return Author;
	}

	public void setAuthor(String author)
	{
		Author = author;
	}

	public String getBook()
	{
		return Book;
	}

	public void setBook(String book)
	{
		Book = book;
	}

//	public String getChapter()
//	{
//		return Chapter;
//	}
//
//	public void setChapter(String chapter)
//	{
//		Chapter = chapter;
//	}
//
//	public String getSubChapter()
//	{
//		return subChapter;
//	}
//
//	public void setSubChapter(String subChapter)
//	{
//		this.subChapter = subChapter;
//	}

	public int getParagraph()
	{
		return Paragraph;
	}

	public void setParagraph(int paragraph)
	{
		Paragraph = paragraph;
	}

	public String getImage()
	{
		return Image;
	}

	public void setImage(String image)
	{
		Image = image;
	}

	public String getTable()
	{
		return Table;
	}

	public void setTable(String table)
	{
		Table = table;
	}
	
	
}
