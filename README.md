# Progetto_OOP

**Breve introduzione**

Il seguente programma scritto in linguaggio java e implementato in spring si pone lo scopo di restituire informazioni di tipo statistico su una collezione di dati riguardanti le spese effettuate dalle varie università, enti e regioni d’Italia per interventi con fondi regionali.

**Come funziona il programma?**

All’avvio l’applicazione, collegandosi all’url del json fornito ([https://www.dati.gov.it/api/3/action/package_show?id=8fbf6192-ea6e-4b04-a526-53229ab8f095](https://www.dati.gov.it/api/3/action/package_show?id=8fbf6192-ea6e-4b04-a526-53229ab8f095)) verifica la presenza di file csv e, in caso positivo, effettua il download (solo se il file non è già stato scaricato in precedenza).  
Successivamente viene eseguito il parsing del primo file csv all’interno di un vettore BancaDati contenente tante classi Dati quante sono le righe del csv.  
L’utente in seguito, collegandosi al localhost e tramite richieste REST GET, può ricevere in output la lista degli elementi in formato json, l’elenco dei metadati (sempre in formato json) e e statistiche riguardanti i vari attributi di ogni elemento della collezione (anche con utilizzo di filtri).

**Istruzioni per l'uso**

Una volta avviato il programma l'utente deve collegarsi da browser al localhost (http:/localhost:8080/), in questo modo sarà reindirizzato alla home dell'applicazione. Tramite query string può ottenere vari dati in formato json attraverso l'utilizzo dei seguenti comandi:
/dati
/metadati
/stats

per ottenere la lista dati filtrata invece si hanno due opzioni.

/condfilter?tipo=(tipo di filtro)&attributo=(attributo)&min=(valore minimo)&max=(valore massimo)&val=(valore discriminante)

condfilter è un filtro condizionale e i valori ammessi sono i seguenti.
tipo di filtro:
$bt per indicare "compreso", implica min e max
$lte per indicare "minore o uguale", implica val
$gte per indicare "maggiore o uguale", implica val

attributo;
anno_solare per scegliere l'anno solare
spesa_laurea per scegliere le spese pe le lauree
spesa_dottorato per scegliere le spese per i dottorati
spesa_specializzazione per scegliere le spese per le specializzazioni

valore minimo, valore massimo e valore discriminante: immettere un numero
        
/logfilter?tipo=(tipo di filtro)&attributo1=(attributo1)&valore1=(valore1)&attributo2=(attributo2)&valore2=(valore2)

logfilter è un filtro logico e i valori ammessi sono i seguenti.
tipo di filtro:
$and per indicare "e", implica min e max
$or per indicare "o", implica val

attributo;
anno_solare per scegliere l'anno solare
spesa_laurea per scegliere le spese pe le lauree
spesa_dottorato per scegliere le spese per i dottorati
spesa_specializzazione per scegliere le spese per le specializzazioni

valore minimo, valore massimo e valore discriminante: immettere un numero

**Diagrammi UML**


<!--stackedit_data:
eyJoaXN0b3J5IjpbMTY5MjcwMjMxMSwtMTE2MTg2MDI4OSw0OT
c2MzE0MjUsMTMzODI4OTYyN119
-->