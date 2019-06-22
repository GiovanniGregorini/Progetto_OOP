---


---

<h1 id="progetto_oop">Progetto_OOP</h1>
<p><strong>Breve introduzione</strong></p>
<p>Il seguente programma scritto in linguaggio java e implementato in spring si pone lo scopo di restituire informazioni di tipo statistico su una collezione di dati riguardanti le spese effettuate dalle varie università, enti e regioni d’Italia per interventi con fondi regionali.</p>
<p><strong>Come funziona il programma?</strong></p>
<p>All’avvio l’applicazione, collegandosi all’url del json fornito (<a href="https://www.dati.gov.it/api/3/action/package_show?id=8fbf6192-ea6e-4b04-a526-53229ab8f095">https://www.dati.gov.it/api/3/action/package_show?id=8fbf6192-ea6e-4b04-a526-53229ab8f095</a>) verifica la presenza di file csv e, in caso positivo, effettua il download (solo se il file non è già stato scaricato in precedenza).<br>
Successivamente viene eseguito il parsing del primo file csv all’interno di un vettore BancaDati contenente tante classi Dati quante sono le righe del csv.<br>
L’utente in seguito, collegandosi al localhost e tramite richieste REST GET, può ricevere in output la lista degli elementi in formato json, l’elenco dei metadati (sempre in formato json) e e statistiche riguardanti i vari attributi di ogni elemento della collezione (anche con utilizzo di filtri).</p>
<p><strong>Istruzioni per l’'uso</strong></p>
<p>**

Una volta avviato il programma l’utente deve collegarsi da browser al localhost (http:/localhost:8080/), in questo modo sarà reindirizzato alla home dell’applicazione. Tramite query string può ottenere vari dati in formato json attraverso l’utilizzo dei seguenti comandi:<br>
/dati<br>
/metadati<br>
/stats</p>
<p>per ottenere la lista dati filtrata invece si hanno due opzioni.</p>
<p>/condfilter?tipo=(tipo di filtro)&amp;attributo=(attributo)&amp;min=(valore minimo)&amp;max=(valore massimo)&amp;val=(valore discriminante)</p>
condfilter è un filtro condizionale e i valori ammessi sono i seguenti.</p><p>tipo di filtro:<br>
$bt per indicare “comprelte per indicare “minore o uguale, implica val<br>$gte per indicare “maggiore o uguale”", implica val</p>
<p>

attributo:<br>
anno_solare per scegliere l’anno solare<br>
spesa_laurea per scegliere le spese pe le lauree<br>
spesa_dottorato per scegliere le spese per i dottorati<br>
spesa_specializzazione per scegliere le spese per le specializzazioni</p>
<p>valore minimo, valore massimo e valore discriminante:<br>
immettere un numero</p>
<p>/logfilter?tipo=(tipo di filtro)&amp;attributo1=(attributo1)&amp;valore1=(valore1)&amp;attributo2=(attributo2)&amp;valore2=(valore2)</p>
logfilter è un filtro logico e i valori ammessi sono i seguenti.</p>
<p>

tipo di filtro:<br>
$and per indicare “e”<br>"e"
$>
<p>"o"

attributo1, attributo2:<br>
anno_solare per scegliere l’anno solare<br>
spesa_laurea per scegliere le spese pe le lauree<br>
spesa_dottorato per scegliere le spese per i dottorati<br>
spesa_specializzazione per scegliere le spese per le specializzazioni</p>
valore1, valore2:<br>
immettere un numero</p>
<p><strong>Diagrammi UML</strong></p>
<p>Diagramma dei casi d’'uso<br>
<img sshttps://github.com/GiovanniGregorini/Progetto_OOP/blob/master/progetto_OOP_spring/UML/Diagramma%20dei%20casi%20d'uso.png?raw=trueDiagramma dei casi d'uso.png"></p>
<p>)

Diagramma delle classi<br>
<img src="https://github.com/GiovanniGregorini/Progetto_OOP/blob/master/progetto_OOP_spring/UML/diagramma.png?raw=true" alt="diagramma.png"></p>
<p>)

Diagramma delle equenzele sSequenze<br>
<img src=".png](https://github.com/GiovanniGregorini/Progetto_OOP/blob/master/progetto_OOP_spring/UML/Diagramma%20delle%20Sequenze.png?raw=true" alt="Diagramma del"></p>)

<!--stackedit_data:
eyJoaXN0b3J5IjpbMTA4NjUxNjYyMF19
-->