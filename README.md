---


---

<h1 id="progetto_oop">Progetto_OOP</h1>
<p><strong>Breve introduzione</strong></p>
<p>Il seguente programma scritto in linguaggio java e implementato in spring si pone lo scopo di restituire informazioni di tipo statistico su una collezione di dati riguardanti le spese effettuate dalle varie università, enti e regioni d’Italia per interventi con fondi regionali.</p>
<p><strong>Come funziona il programma?</strong></p>
<p>All’avvio l’applicazione, collegandosi all’url del json fornito (<a href="https://www.dati.gov.it/api/3/action/package_show?id=8fbf6192-ea6e-4b04-a526-53229ab8f095">https://www.dati.gov.it/api/3/action/package_show?id=8fbf6192-ea6e-4b04-a526-53229ab8f095</a>), verifica la presenza di file csv e, in caso positivo, effettua il download (solo se il file non è già stato scaricato in precedenza).<br>
Successivamente viene eseguito il parsing del primo file csv all’interno di un vettore BancaDati contenente tante classi Dati quante sono le righe del csv.<br>
L’utente in seguito, collegandosi al localhost e tramite richieste rest e get, può<br>
ricevere in output la lista degli elementi in formato son, l’elenco dei metadati sempre in formato json e varie statistiche riguardanti i vari attributi di ogni elemento della collezione (anche con utilizzo di filtri).</p>

**Diagrammi UML**

Diagramma dei casi d'uso

![Diagramma dei casi d'uso.png](blob:https://stackedit.io/6d92b4ae-c21e-464a-93cc-47f35ab4fe40)

Diagramma delle classi

![diagramma.png](blob:https://stackedit.io/33df9553-be19-4f30-b3e5-2b4dcd00896f)
<!--stackedit_data:
eyJoaXN0b3J5IjpbMTIxMzEyODc2NiwtNTc3MDA2MjgsLTE5NT
U1MTk5OTNdfQ==
-->