# Progetto_OOP

**Breve introduzione**

Il seguente programma scritto in linguaggio java e implementato in spring si pone lo scopo di restituire informazioni di tipo statistico su una collezione di dati riguardanti le spese effettuate dalle varie università, enti e regioni d’Italia per interventi con fondi regionali.

**Come funziona il programma?**

All'avvio l'applicazione, collegandosi all'url del json fornito (https://www.dati.gov.it/api/3/action/package_show?id=8fbf6192-ea6e-4b04-a526-53229ab8f095), verifica la presenza di file csv e, in caso positivo, effettua il download (solo se il file non è già stato scaricato in precedenza).
Successivamente viene eseguito il parsing del primo file csv all'interno di un vettore BancaDati contenente tante classi Dati quante sono le righe del csv.
L'utente in seguito, collegandosi al localhost e tramite richieste rest e get, può
ricevere in output la lista degli elementi in formato son, l'elenco dei metadati sempre in formato json e varie statistiche riguardanti i vari attributi di ogni elemento della collezione (anche con utilizzo di filtri).


<!--stackedit_data:
eyJoaXN0b3J5IjpbMTQyMDM1Mjg5MywtNDI5MTU5NDg0LC03MD
k0MDQ4NDldfQ==
-->