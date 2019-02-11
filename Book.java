/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = bookCourseText;
    }
    
    public void borrow(){
        borrowed += 1;
    }

    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {
        return title;
    }
    public int getPages()
    {
        return pages;
    }
    public int getBorrowed()
    {
        return borrowed;
    }
    public boolean isCourseText()
    {
        return courseText;
    }
    
    public void printAuthor()
    {
        System.out.println(author);
    }    
    public void printTitle()
    {
        System.out.println(author);
    }
    
    public void printDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Borrowed: " + borrowed + "x");
        
        if(refNumber.length() > 0){
            System.out.println("Refnumber = " + refNumber);
        }else{
            System.out.println("Refnumber = zzz");
        }    
    }
    
    public void setRefNumber(String ref)
    {
        if(ref.length() >= 3){
        refNumber = ref;
    }else{
        System.out.println("Refnumber must be atleast 3 characters!");
    }
    }
    public String getRefNumber()
    {
        return refNumber;
    }
       
}

    

    
