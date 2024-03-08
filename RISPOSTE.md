```
Rispondere negli spazi indicati
```

Markdown tutorial: [Cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

1. ... risposta ...
il termine crittografia deriva dal greco “kryptó-s” che significa “nascosto” e “graph`ıa” che significa “scrittura. e sta a simbollegiare l'arte di scrivere messagi segreti
infatti essa permette la protezione dell'informazione e dei dati attraverso l'uso di un programma che cambierà le lettere attraverso l'utilizzo di una chiave di cifratura 
ESEMPIO: se vogliamo un algoritmo banale che sposti di un tot numeri (chiave) la lettera verso destra questo la eseguira cambiando totalmente la frase ad esempio se la chiave è 3 dalla lettera 'a' si spostera a 'd' e cosi via per tutte le lettere
```
Fonti:
https://cloud.google.com/learn
```

2. 

... risposta ...
La crittografia simmetrica, nota anche come algoritmo di chiave condivisa o privata, utilizza la stessa chiave per la crittografia e la decrittografia. I sistemi di crittografia simmetrici sono considerati meno costosi da produrre e non richiedono molta potenza di computing per la crittografia e la decrittografia, il che significa che ci sono meno ritardi nella decodifica dei dati. 
invece La crittografia asimmetrica, nota anche come crittografia a chiave pubblica, utilizza due chiavi separate per criptare e decriptare(fase inversa della crittazione) i dati. Una è una chiave pubblica condivisa tra tutte le parti per la crittografia. Chiunque abbia la chiave pubblica può quindi inviare un messaggio criptato, ma solo i titolari della seconda chiave privata possono decriptarlo. 

i problemi della crittografia simmetrica se una persona non autorizzata si impossessa della chiave, potrà decriptare tutti i messaggi e i dati inviati tra le parti. Di conseguenza, il trasferimento della chiave condivisa deve essere criptato con una chiave di crittografia diversa, con conseguente ciclo di dipendenze. 

i problemi della crittografia asimmetrica: piu costosa da produrre e a volte inadatta per grandi pacchetti 
```
Fonti:
https://cloud.google.com/learn

```

3. 

... risposta ...
La firma digitale è l'equivalente elettronico, con pari valore legale, di una tradizionale firma apposta su carta. ha tre principi fondamentali: 
- assicura l'identità della persona o dell'impresa che firma un documento; 
-integrità, in quanto assicura che i documenti firmati non sono stati modificati dopo la firma; 
-non ripudio, in quanto un documento firmato tramite firma elettronica non può essere "disconosciuto" da chi l'ha firmato.

Dal punto di vista tecnico, la firma digitale utilizza la tecnica della crittografia asimmetrica a doppia chiave (una pubblica e una privata), applicando particolari funzioni matematiche
```
Fonti:
-appunti
-datalog.it
```

4. 

... risposta ...


```
Fonti:

```

5. 

... risposta ...
La Post-Quantum Cryptography (PQC) è, invece, una risposta classica all’avvento del calcolo quantistico. La PQC si occupa, infatti, del design di schemi crittografici a chiave pubblica implementabili su elaboratori classici e resistenti anche ad attacchi di tipo quantistico. Di conseguenza, le tecniche crittografiche post-quantum basano la propria sicurezza su problemi matematici per cui non sono noti algoritmi risolutivi efficienti, indipendentemente dalla loro natura classica o quantistica. Ad esempio, RSA e Diffie-Hellman, basandosi su problemi risolvibili con l’algoritmo quantistico di Shor, non possono essere considerati post-quantum.

```
Fonti:
telsy.com
```

6. 

... risposta ...
La crittografia omomorfica, è una tipologia di crittografia a chiave pubblica, è caratterizzata dalla possibilità di intervenire sul contenuto crittografato.
Quindi, in buona sostanza, non occorre avviare un processo di decodifica prima di elaborare i dati. Il vantaggio è proprio sul versante della sicurezza, perché il contenuto codificato non apre mai il suo guscio crittografico.
Il termine omomorfico, del resto, arriva proprio dalla matematica e a sua volta dal greco, col significato di “stessa struttura”. Qualsiasi sia il processo matematico applicato al dato codificato o decodificato, il risultato sarà dunque sempre lo stesso.
Una crittografia omomorfica FHC richiede ancora una lunga fase di sviluppo, al termine del quale, tuttavia, si avranno strumenti con un approccio molto diverso alla codifica dei dati.

La crittografia omomorfica aprirà probabilmente a utilizzi diversi e nuove possibilità tutte da esplorare.

L’obiettivo, però, che si tratti di crittografia omomorfica e quantistica, sarà sempre lo stesso: mettere al sicuro i nostri dati, una volta per tutte

```
Fonti:
cybersecurity360.com
```

7. 

... risposta ...
lo Zero-Knowledge Proof è un protocollo crittografico di grande risonanza,
dovuta principalmente al grande approfondimento relativamente alle Blockchain;
Lo Zero-Knowledge Proof (ZKP) si basa su una idea molto semplice:
un’entità (prover ), deve poter dimostrare ad un’altra (verifier ), che una
data affermazione sia vera, senza però rivelare a questi alcuna informazione aggiuntiva sull’affermazione stessa (al di fuori della sua veridicità).
Lo ZKP rappresenta una particolare classe di Interactive Proof System
per un dato linguaggio L, caratterizzato dalle tre seguenti proprietà fondamentali:
- Completeness: se l’affermazione del prover è vera, la probabilità di
rifiuto, da parte del verifier, è trascurabile  
- Soundness: è la proprietà che specializza la classe; se l’affermazione
del prover è falsa, la probabilità di accettazione, da parte del verifier, è trascurabile
- Zero-Knowledge: se l’affermazione è vera, il verifier non apprende
nulla, al di fuori della veridicità dell’affermazione stessa;

```
Fonti:
politecnico delle marche
```

8. 

... risposta ...
Grazie alla tecnica crittografica end-to-end gli utenti coinvolti nello scambio comunicativo avranno la certezza che, anche in caso di attacco ai server dell'azienda che eroga il servizio. i loro pacchetti dati saranno al sicuro da occhi indiscreti. La crittografia end-to-end, infatti, dà modo di crittografare i pacchetti in modo che solo i due nodi comunicanti (quello emittente e quello ricevente) siano in grado di decriptare – e quindi decifrare – i messaggi inviati attraverso la Rete. In altre parole, le chiavi crittografiche sono presenti direttamente nei computer (o negli smartphone o altro device) che inviano e ricevono ai messaggi, mentre i server della società agiscono come semplici postini, incapaci di leggere (decifrare) i messaggi in transito. è necessario adottare un sistema di crittografia che prevede l'utilizzo di due chiavi crittografiche: una pubblica e l'altra privata quindi asimmetrica.

vantaggi: La crittografia end-to-end è un metodo di sicurezza che protegge le comunicazioni. Grazie alla crittografia end-to-end, nessuno, comprese Google e terze parti, può leggere i messaggi idonei durante il trasferimento tra il tuo telefono e quello a cui invii messaggi.

```
Fonti:
fastweb.it
appunti
```

9. 

... risposta ...
La blockchain utilizza la crittografia asimmetrica per permettere lo scambio di beni (come ad esempio criptovalute) tra una persona e un'altra. Ogni persona che detiene un bene (di qualsiasi tipo) sulla blockchain è in possesso di una chiave pubblica - nota anche come "address" (indirizzo) - e di una chiave privata.
Grazie alle funzioni hash, ai sistemi crittografici a chiave pubblica e alla firma digitale, è possibile definire una struttura di dati a blocchi, detta appunto Blockchain (catena di blocchi), che ha una particolare resistenza ad essere modificata e che quindi permette di costruire un archivio dove registrare delle transazioni, sostanzialmente impossibili da contraffare. È implementando questa struttura che un non identificato programmatore (sotto lo pseudonimo di Satoshi Natamoto) ha creato nel 2009 la prima
criptomoneta e la più famosa delle blockchain:
Bitcoin.

```
Fonti:
politecnico di torino
cryptoinvestire.com
```

10. 

... risposta ...
la crittografia ad esempio la end to end in teoria dovrebbe prottegerci dalla sorveglianza di massa impedendo a chiunque di accedere ai messagi e garantisce la privacy personale

```
Fonti:
appunti
```