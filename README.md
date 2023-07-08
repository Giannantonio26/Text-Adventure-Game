# Progetto_Map

## Indice

- [Caso di studio](#caso-di-studio)
- [Diagramma delle classi](#diagramma-delle-classi)
- [Specifica algebrica](#specifica-algebrica)
- [Argomenti inseriti nel caso di studio](#argomenti-inseriti-nel-caso-di-studio)
  - [Paradigma OO](#paradigma-OO)
  - [Collection](#collection)
  - [Eccezioni](#eccezioni)
  - [File](#file)
  - [JDBC](#jdbc)
  - [Thread](#thread)
  - [Socket](#socket)
  - [Lambda expressions](#lambda-expressions)
  - [Swing](#swing)

---

## Caso di studio<a name="caso-di-studio"></a>

---

## Diagramma delle classi
---

## Specifica algebrica

---

## Argomenti inseriti nel caso di studio<a name="argomenti-inseriti-nel-caso-di-studio"></a>

### Paradigma OO<a name="paradigma-OO"></a>
Nel seguente caso di studio è stato fatto uso del paradigma OO(Object Oriented).
In questo paradigma si orgnanizza il codice intorno agli oggetti, i quali rappresentano entità del mondo reale o concetti astratti.
Ci sono tre principi fondamentali della programmazione orientata agli oggetti: Incapsulamento, Ereditarietà e Polimorfismo.
#### Incapsulamento
Information hiding e incapsulamento sono concetti cardine del paradigma orientato a oggetti.
Gli oggetti all'interno del programma incapsulano uno stato e un comportamento. Lo stato è identificato dal contenuto di una certa area di memoria. Il comportamento è definito come una collezione di procedure e funzioni (metodi) che possono operare sulla rappresentazione dell’area di memoria associata all’oggetto.
L'utilizzo dell'occultamento dell'informazione e l'incapsulamento rendono possibile l'uso di oggetti ricorrendo solo a metodi pubblici. Gli attributi delle classi sono quasi sempre privati, perciò non accessibili direttamente da altre classi o oggetti, essi forniscono un controllo più stretto sull'accesso e la modifica dei dati di una classe.

#### Erditarietà
E' stato fatto utilizzo dell'ereditarietà, nonchè una relazione fondamentale tra le classi. Una classe è considerata come un repertorio di conoscenze a partire dal quale è possibile definire altre classi più specifiche, che completano le conoscenze della loro classe madre.
Un esempio di ereditarietà presente all'interno del caso di studio è la relazione tra la classe astratta Database e la classe DatabaseController, dove DatabaseController è una sottoclasse di Database, perciò eredita tutti i metodi e attributi public/protected. 
La sottoclasse DatabaseController introduce delle caratteristiche non presenti nella superclasse, quindi in questo caso è stata utilizzata l'ereditarietà per estensione.
Allo stesso tempo però la sottoclasse DatabaseController effettua l'overriding dei metodi ereditati dalla superclasse Database, fornendo un implementazione dei metodi astratti. Perciò in questo caso è stata utilizzata l'ereditarietà per variazione funzionale poichè si ridefiniscono alcune caratteristiche della superclasse.
Ovviamente questo non è l'unico utilizzo di ereditarietà all'interno del caso di studio.

#### Polimorfismo
E' stato fatto utilizzo del polimorfismo. Con questo termine si intende la possibilità di associare a una operazione diverse realizzazioni. 
Per esempio si è fatto uso del polimorfismo ad hoc, ottenuto quando un metodo lavora su tipi differenti e potrebbe comportarsi in maniera totalmente differente per ciascuno di essi. Un esempio di utilizzo lampante di polimorfismo per overloading (che rientra nel polimorfismo ad hoc) nel caso di studio è osservabile nell'implementazione del metodo getPunteggio della classe DatabaseController dove il metodo restituisce il punteggio di una partita sia passando il nome della partita (parametro di tipo String), sia passando l'id della partita (parametro di tipo int). La classe DatabaseController ha due diverse implementazioni del metodo getPunteggio in base al tipo del parametro ricevuto.
Inoltre, si è fatto utilizzo del polimorfismo universale, la cui idea è quella di operare su un numero infinito di tipi. Infatti nel caso di studio è stata creata una classe generica StampaListe che opera su un tipo generico T, permette di stampare attraverso il metodo 'stampa' la lista ricevuta in input dal costruttore indipendentemente dal tipo degli elementi della lista.

---
### Collection<a name="collection"></a>
All'interno del caso di studio sono state utilizzate le seguenti collection:
#### List
Le liste vengono utilizzate all'interno del caso di studio nelle seguenti situazioni:
* La classe Classifica ha come attributo una lista di elmenti di tipo Partita, la lista di partite viene utilizzata dal metodo 'ottieniClassificaUtenti' per filtrare le partite degli utenti e costruire il ranking degli utenti che hanno vinto almeno una partita con il punteggio massimo.
* Il metodo ottieniClassificaUtenti restitutuisce una lista di elementi di tipo Map.Entry<String,Integer>, nonchè una lista di coppie <chiave,valore> dove la chiave è il nome dell'utente e il valore il punteggio massimo associato a quell'utente.
* La classe DatabaseController ha un metodo 'ottieniListaPartite' che salva tutte le partite salvate su DB all'interno di una lista, per poi successivamente restituirla.
* La classe GameDescription ha come attributi:
  - una lista di elementi di tipo Stanza
  - una lista di elementi di tipo Comando
  - una lista di elementi di tipo Oggetto per l'inventario
  - una lista di elementi di tipo Oggetto per gli oggetti del gioco
* La classe Inventario ha come attributo una lista di elementi di tipo Oggetto utilizzata dai metodi della classe per aggiungere e rimuovere elementi nell'inventario
* La classe Stanza ha come attributo una lista di elementi di tipo Oggetto
* La classe OggettoContenitore ha come attributo una lista di elementi di tipo Oggetto contenente gli oggetti contenuti dal contenitore
* Il metodo parseString della classe Utils utilizza una lista di token, nonchè una lista di elementi di tipo String
* la classe generica 'stampaListe' utilizza come attributo una lista di elementi di tipo generico.
#### Set
* Set 'stopwords' utilizzato per contenere tutte le stopwords recuperate dal file senza contenere duplicati 
* La classe ControlGioco utilizza un set 'comandi', nonchè un set di elementi di tipo Comando
* La classe Oggetto utilizza un set 'aliasOggetto' per contenere tutti i possibili alias del nome di un oggetto e un set 'comandiConsentiti' per contenere tutti i comandi consentiti su un determinato oggetto
* La classe Comando utilizza un set 'aliasComando' per contenere tutti gli alias del nome di un comando
#### Map
* Il metodo ottieniClassificaUtenti della classe Classifica salva in una Map con chiave di tipo String e valore di tipo Integer tutti gli utenti che hanno vinto almeno una partita con il loro corrispettivo punteggio massimo, la chiave è il nome dell'utente, il valore il punteggio massimo.
* Lista di elementi di tipo Map.Entry<String,Integer> per contenere le coppie chiave-valore(nome utente-punteggio massimo) per la stampa del ranking.

---
### Eccezioni<a name="eccezioni"></a>

---
### File<a name="file"></a>

---
### JDBC<a name="jdbc"></a>

---
### Thread<a name="thread"></a>

---
### Socket<a name="socket"></a>

---
### Lambda expressions<a name="lambda-expressions"></a>

---
### Swing<a name="swing"></a>

---

