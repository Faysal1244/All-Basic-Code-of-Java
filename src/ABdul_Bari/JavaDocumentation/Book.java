/** @author Faysal
 * @version 2.0
 * @since  2021
 */
package ABdul_Bari.JavaDocumentation;

/**
 *  @author Faysal
 *
 *  Class for Library Book
 */

public class Book {
    /**
     * @value 10 default value
     */
    static int val = 10;

    /**
     *
     * @param s Book Name
     */
    public Book(String s){

    }

    /**
     *Issue a book to a student
     * @param roll roll number for a student
     * @throws Exception if book is not available
     */
    public void issue(int roll) throws Exception{

    }

    /**
     * Check if book is available
     * @param str
     * @return is book is available , then return true else false
     */
    public boolean available(String str){
        return  true;
    }

    /**
     * Get Book name
     * @param id
     * @return return book name
     */
    public String getName(int id){
        return "";
    }
}
