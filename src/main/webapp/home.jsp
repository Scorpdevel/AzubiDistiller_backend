<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here </title>
<link rel="stylesheet" href="./home.css">
</head>
<body>
    <div class="header">
     <h1 class="title"> AzubiDistiller </h1>
    </div>
    <div  class="test">
        <div class="kunde">
            <h2> Kunde Anlegen </h2>
            <form action="addKunde">
                Kundenummer: 
                <input disabled placeholder="wird generiert" type="text" name="name"> <br>
                Name: 
                <input type="text" name="name"> <br>
                <input type="submit"> <br>
            </form>
        </div>
        <div class="rating">
            <form action="addRating">
                <label for="kunde">Kunde wählen:</label>
                    <select id="kunde" name="kunde">
                    <option value="kunde1">kunde 1</option>
                    <option value="kunde2">kunde 2</option>
                    <option value="kunde3">kunde 3</option>
                    <option value="kunde4">kunde 4</option>
                    </select>
                    <br>
                Ratingverfahren: 
                <input type="text" name="Ratingverfahren"> <br>
                Ratingnote: 
                <input type="number" name="Ratingnote"> <br>
                Datum: 
                <input type="Date" name="Date"> <br>
                <input type="submit"> <br>
            </form>
        </div>
        kunde finden:<br>
        <form action="result.jsp">
                <input type="text" name="name"> <br>
                <input type="submit"> <br>
            </form>
    </div>
</body>
</html>