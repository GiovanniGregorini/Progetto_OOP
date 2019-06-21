
# Progetto_OOP

**Breve introduzione**

Il seguente programma scritto in linguaggio java e implementato in spring si pone lo scopo di restituire informazioni di tipo statistico su una collezione di dati riguardanti le spese effettuate dalle varie università, enti e regioni d’Italia per interventi con fondi regionali.

**Come funziona il programma?**

All’avvio l’applicazione, collegandosi all’url del json fornito ([https://www.dati.gov.it/api/3/action/package_show?id=8fbf6192-ea6e-4b04-a526-53229ab8f095](https://www.dati.gov.it/api/3/action/package_show?id=8fbf6192-ea6e-4b04-a526-53229ab8f095)) verifica la presenza di file csv e, in caso positivo, effettua il download (solo se il file non è già stato scaricato in precedenza).  
Successivamente viene eseguito il parsing del primo file csv all’interno di un vettore BancaDati contenente tante classi Dati quante sono le righe del csv.  
L’utente in seguito, collegandosi al localhost e tramite richieste REST GET, può ricevere in output la lista degli elementi in formato json, l’elenco dei metadati (sempre in formato json) e varie statistiche riguardanti i vari attributi di ogni elemento della collezione (anche con utilizzo di filtri).

**Diagrammi UML**

Diagramma dei casi d'uso

![Diagramma dei casi d'uso.png](https://github.com/GiovanniGregorini/Progetto_OOP/blob/master/progetto_OOP_spring/UML/Diagramma%20dei%20casi%20d'uso.png?raw=true)

Diagramma delle classi

![diagramma.png](https://github.com/GiovanniGregorini/Progetto_OOP/blob/master/progetto_OOP_spring/UML/diagramma.png?raw=true)

Diagramma delle sequenze

![Diagramma delle Sequenze.png](https://github.com/GiovanniGregorini/Progetto_OOP/blob/master/progetto_OOP_spring/UML/Diagramma%20delle%20Sequenze.png?raw=true)
<!--stackedit_data:
eyJoaXN0b3J5IjpbMzc2Njc2ODY4XX0=
-->