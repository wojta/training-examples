Příklad HelloWold
=================

* V tomto příkladu se naučíme vytvořit základ Android projektu s jednou aktivitou (obrazovkou interagující s uživatelem)
* Ukážeme si obsluhu události kliknutí na tlačítko a získání textu z textového políčka
* Ukážeme si jak zobrazit toast - jednoduché textové upozornění na obrazovce


Postup
------
1) Založte v IDEA nový projekt (File > New project... > Empty project)

2) Založte v IDEA nový modul (_File > New module... > Java > Android > Application module_)

3) Upravíme UI definované v layoutu (rozvržení) *res/layout/main.xml*

* přidání textového políčka
    * v adresáři *res/layout* najdeme soubor `main.xml` a dvojklikem otevřeme designer layoutů
	* ze záložky *Text Fields* přesuneme do layoutu
* přidání tlačítka - stejným způsobem pod vytvořené textové políčko
	* tlačítku dvojklikem naeditujeme *text* na "Zobraz toast" (případně nastavením v *Properties*)
	* úprava identifikátorů id
		* políčku dáme ID - `edToast`
		* tlačítku dáme ID - `btToast`

3) Otevřeme třídu `HelloToastActivity.java` v *src/&lt;packagename&gt;*

4) Budeme editovat metodu `onCreate()` - ta se spouští při vytváření

   * nejprve je potřeba získat instance daných prvků UI pomocí metody `findViewById()`
   * poté tlačítku pomocí `setOnClickListener()` nastavíme příslušný listener, který bude zobrazovat Toast

5) Pomocí *Run...* > *Edit configurations...* přidáme konfiguraci pro spouštění typu Android Application


HelloWorld example
==================

* You will learn to create Android project with one activity (the screen interacting with user).

<img src="http://raw.githubusercontent.com/wojta/training-examples/master/_images/hello_toast.png" />