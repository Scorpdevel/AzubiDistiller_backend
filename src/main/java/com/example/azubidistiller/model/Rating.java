// package com.example.azubidistiller.model;

// import java.util.UUID;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;

// import java.text.DateFormat;
// import java.text.SimpleDateFormat;  
// import java.util.Date;    

// @Entity
// public class Rating {
//     @Id
//     @GeneratedValue(strategy=GenerationType.AUTO)
//     private  Long id;
//     private  int Kundennummer;
//     private  String Ratingverfahren;
//     private  int Ratingnote; 
//     private  Date date;
//     // SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");




//     public Rating( Long id,int Kundennummer, String Ratingverfahren, int Ratingnote, Date date) {
//         this.id = id;
//         this.Kundennummer = Kundennummer;
//         this.Ratingverfahren = Ratingverfahren;
//         this.Ratingnote = Ratingnote;
//         this.date = date;
//     }
    


//     public void setDate(Date date) {
//         this.date = date;
//     }


//     public Long getId() {
//         return this.id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public int getKundennummer() {
//         return this.Kundennummer;
//     }

//     public void setKundennummer(int Kundennummer) {
//         this.Kundennummer = Kundennummer;
//     }

//     public String getRatingverfahren() {
//         return this.Ratingverfahren;
//     }

//     public void setRatingverfahren(String Ratingverfahren) {
//         this.Ratingverfahren = Ratingverfahren;
//     }

//     public int getRatingnote() {
//         return this.Ratingnote;
//     }

//     public void setRatingnote(int Ratingnote) {
//         this.Ratingnote = Ratingnote;
//     }


//     public Date getDate() {
//         return this.date;
//     }


// }
