# Proiect-Ps

Proiectul pe care am ales sa il implementez este o aplicatie online pentru o agentie imobiliara, prin intermediul careia clientii sa poata vizualiza anunturile puse la dispozitie de catre acea agentie . Aplicatia contine o baza de date formata din 4 tabele: administratori, agenti, clienti si anunturi. Fiecare administrator, agent si client are un id, nume, prenume, telefon, email, username si parola. Anuntul este caracterizat prin id, id-ul agentului care l-a publicat, tipul anuntului(vanzare, inchiriere), tipul proprietatii (casa, apartament, garsoniera), locatie, numar de camere, suprafata si pret. Id-ul fiecarui obiect se genereaza automat in functie de id-ul maxim din tabel la care se va adauga 1. Aplicatia e structurata in urmatoarele pachete: controller, logic, model, repository si service. Clasele din pachetul model reprezinta obiectele cu predicatele corespunzatoare fiecarei coloane din fiecare tabel. In pachetul service avem interfetele cu metodele  care pot fi implementate pentru toate tabelele si clasele care implemneteaza interfetele respective . In pachetul controller , avem cate un controller pentru fiecare tabel, acestea continand toate actiuniile care pot fi facute asupra acestora. In pachetul logic sunt implementate operatiile  folosindu-ne de  metodele implementate in clasele din pachetul service.

Pentru Tema 2 proiectul a fost actualizat cu teste Junit pentru clasele din pachetul service si repository, factory design pattern, diagrama UML de clase, diagrama de baze de date, finalizare endpoints  si completarea javadoc ului.

## Factory design pattern
Pentru implementarea factory design patter, in pachetul model am adaugat o clasa de tip enum, o interfata, o clasa pentru a crea un tip de utilizator. Fiecare tip de utilizator are un tabel corespunzator in baza de date. Tipurile de utilizatori din enum sunt: administrator, agent, client.

## JUnit Test

In folderul de testare am creat pachetul service care contine cate o clasa corespunzatoare pentru testarea fiecarei metode din clasele de service.

## Diagrama UML
![image](https://user-images.githubusercontent.com/72441193/168235428-db736d61-4725-440c-9771-477efddd9072.png)

In pachetul repository avem interfetele AnuntRepository, AgentRepository, AdminRepository, ClientRepository care auto-implementeaza operatiile  de bazam asupra tabelelor din baza de date. 

In pachetul service , avem cate o interfata pentru fiecare tabel care contin metodele ce pot fi apelate asupra cestora si la randul lor , fiecare interfata are si o clasa in care se implementeaza logica din spatele metodelor folosinu-ne de obiecte de tipul interfetelor din repository.



## Diagrama bazei de date
![image](https://user-images.githubusercontent.com/72441193/168190502-3c226d68-7e95-4446-9938-5ef609e5e7af.png)

Baza de date e compusa din 4 tabele.

Tabelul Administratori e definit de urmatoarele atribute: id, nume, prenume, numar de telefon, email, username, password.

Tabelul Agenti e definit de urmatoarele atribute:  id, nume, prenume, numar de telefon, email, username, password.

Tabelul Clienti e definit de urmatoarele atribute:  id, nume, prenume, numar de telefon, email, username, password.

Tabelul Anunturi e definist de atributele: id, id_agent (agentul care a publicat anuntul), tipul anuntului( inchiriere, vanzare), tipul locuintei(garsoniera, apartament, casa), pret, numar camere.

Coloana id_agent din tabelul anunturi este Foreign Key cu legatura catre coloana id din tabelul Agenti.


## Tema3 si proiectul final

Urmand tutorialele de Android Studio am reusit sa creez o interfata pentru aplicatie.
Aplicatia realizata are 4 pagini intre care putem naviga si diverse operatii implementate .
Proiectul final are 4 activitati, legate intre ele  astfel incat utilizatorul sa poata naviga.
Navigarea intre activitati a fost realizata prin intermediul butoanelor si a mesajului Intent.
Fisierele .xml pentru activitati contin toate elementele existente in UI carora li s au atribuit
actiuni sau operatii in alte clase.

Pagina principala contine doua ImageButton , unul de login si celalalt pentru vizualizarea anunturilor, si un Floating Button destinat trimiterii emailurilor. De asemenea pentru pentru o grafica mai interesanta am adaugat si un gif pe post de background.

Pagina care va aparea cand apasam butonul cu casa, contine un buton pentru filtrarea anunturilor dupa un pret dat si un scrollView unde ni se vor afisa anunturile disponibile cand se va deschide fereastra.

Pagina de login contine campurile destinate usernameului si parolei si 3 butoane, unul pentru autentificare, unul prentru register in cazul in care utilizatorul nu are cont si un buton de back care ne intoarce la pagina principala.

Butonul de Register va deschide a 4 a pagina si anume pagina de register unde vom avea campuri pentru introducerea datelor necesare pentru crearea contului.

In ceea ce priveste legatura dintre frontend si backend, am implementat doua operatii de get , una e implementata in spatele butonului cu casa din  interfata principala, si realizeaza extragerea din tabel a datelor despre toate anunturile, iar cealalta este declansata la apasarea butonului "Filtrare anunturi dupa pret" din interfata destinata anunturilor.

Interfata principala
![image](https://user-images.githubusercontent.com/72441193/171862529-fc2f20ae-c3dc-4572-adba-b2cb119c90b8.png)

Interfata cu anunturile
![image](https://user-images.githubusercontent.com/72441193/171862803-0f50e977-8eca-4752-ad8a-04eb2322e292.png)

Interfata de login
![image](https://user-images.githubusercontent.com/72441193/171862956-423d31ff-4d7f-4ea7-8304-db34d710ac48.png)

Interfata de register
![image](https://user-images.githubusercontent.com/72441193/171863040-9e6a10f8-a7c7-495d-9e8a-6e3aacaf2955.png)

