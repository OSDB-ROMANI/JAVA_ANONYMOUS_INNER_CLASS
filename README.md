# JAVA_ANONYMOUS_INNER_CLASS
Servono quando abbiamo bisogno di creare un'oggetto di una tipo classe ma ridefinirne il comportamento. Importate: non scrivo una nuova classe come estensione di quella base. </br>
Se abbiamo bisogno di un oggetto a partire da un'interfaccia possiamo direttamente implementare i suoi metodi nella creazione dell'oggetto.</br>
Due soluzioni:
<ol><li>Classe di riferimento</li><li>Interfaccia</li></ol>
<h2>CLASSE DI RIFERIMENTO</h2>
<li>Dichiaro un oggetto della classe di riferimento</li>
<li>Creo l'oggetto con la parola riservata new nome della classe</li>
<li>Apro le parentesi { } e all'interno devo fare l'Override dei metodi che mi occorrono</li>
<li>In allegato Esempio: daClasse</li>
<h2>INTERFACCIA DI RIFERIMENTO</h2>
<li>Dichiaro un oggetto dell'interfaccia voluta</li>
<li>Creo l'oggetto con la parola riservata new nome dell'interfaccia</li>
<li>Apro le parentesi { } e all'interno devo fare l'Override di tutti i metodi dell'interfaccia</li>
<li>In allegato Esempio: daInterfaccia</li>
