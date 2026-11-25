package main.fullproject;

import java.util.*;
import java.util.logging.Logger;

public class Library {


    private static final Logger log = Logger.getLogger(Library.class.getName());

    private List<Medium> media = new ArrayList<>();
    private Map<String, Medium> mediaById = new HashMap<>();
    private List<Loan> loanHistory = new ArrayList<>();



    public boolean addMedium(Medium medium){
        if (mediaById.containsKey(medium.getId())){
            return false;
        }
        media.add(medium);
        mediaById.put(medium.getId(), medium);
        return true;
    }

    public Medium getById(String id){
        return mediaById.get(id);
    }

    public List<Medium> getSortedMedia(){
        List<Medium> result = new ArrayList<>(media);
        Collections.sort(result);
        return result;
    }

    public boolean borrow(String id, String borrower){

        Medium medium = getById(id);

        if (medium == null){
            return false;
        }

        if (!medium.borrow()){
            return false;
        }

         Loan loan = new Loan(medium, borrower);
         log.info(borrower + " borrowed loan " + loan);
         loanHistory.add(loan);
        return true;
    }


    public boolean returnItem(String id){

        Medium medium = getById(id);

        if (medium == null){
            return false;
        }


        log.info("Återlämnad " + medium.getTitle());
        return medium.returnItem();

    }

    public List<Loan> getHistory(){
        return new ArrayList<>(loanHistory);
    }


    public Set<String> getBorrowers(){

        Set<String> names = new HashSet<>();

        for (Loan loan: loanHistory){
            names.add(loan.getBorrower());
        }
        return names;
    }






}
