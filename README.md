---


---

<h1 id="progetto_oop">Progetto_OOP</h1>
<p><strong>Breve introduzione</strong></p>
<p>Il seguente programma scritto in linguaggio java e implementato in spring si pone lo scopo di restituire informazioni di tipo statistico su una collezione di dati riguardanti le spese effettuate dalle varie università, enti e regioni d’Italia per interventi con fondi regionali.</p>
<p><strong>Come funziona il programma?</strong></p>
<p>All’avvio l’applicazione, collegandosi all’url del json fornito (<a href="https://www.dati.gov.it/api/3/action/package_show?id=8fbf6192-ea6e-4b04-a526-53229ab8f095">https://www.dati.gov.it/api/3/action/package_show?id=8fbf6192-ea6e-4b04-a526-53229ab8f095</a>), verifica la presenza di file csv e, in caso positivo, effettua il download (solo se il file non è già stato scaricato in precedenza).<br>
Successivamente viene eseguito il parsing del primo file csv all’interno di un vettore BancaDati contenente tante classi Dati quante sono le righe del csv.<br>
L’utente in seguito, collegandosi al localhost e tramite richieste rest e get, può ricevere in output la lista degli elementi in formato json, l’elenco dei metadati sempre in formato json e varie statistiche riguardanti i vari attributi di ogni elemento della collezione (anche con utilizzo di filtri).</p>
<p><strong>
**Diagrammi UML</strong></p>
<p>**
</p><p>Diagramma dei casi d’'uso</p>
<p></p><p>![Diagramma dei casi d’uso.png](<a href="https://github.com/GiovanniGregorini/Progetto_OOP/blob/master/progetto_OOP_spring/UML/Diagramma%20dei%20casi%20d'uso.png?raw=true">https://github.com/GiovanniGregorini/Progetto_OOP/blob/master/progetto_OOP_spring/UML/Diagramma dei casi d’uso.png?raw=true</a>" alt=")</p>
<p>Diagramma deille clasi d’uso.png"&gt;</p>
<p>Diagramma delle classi</p>
<p></p><p>![diagramma.png](<a href="https://github.com/GiovanniGregorini/Progetto_OOP/blob/master/progetto_OOP_spring/UML/diagramma.png?raw=true">https://github.com/GiovanniGregorini/Progetto_OOP/blob/master/progetto_OOP_spring/UML/diagramma.png?raw=true</a>" alt=“diagramma.png”&gt;</p>
<p>)
</p><p>Diagramma delle sequenze</p>
<p>![Diagramma delle sSequenze</p>
<p><img src=".png](https://github.com/GiovanniGregorini/Progetto_OOP/blob/master/progetto_OOP_spring/UML/Diagramma%20delle%20Sequenze.png?raw=true" alt="Diagramma delle Sequenze.png"></p>
)

