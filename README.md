# Bildverwaltungs- und Anzeige-System (Client/Server)

## Beschreibung
Dieses Programm besteht aus einem Client- und einem Server-Teil, die gemeinsam eine Bildverwaltungsanwendung implementieren.  
Die Anwendung ermöglicht das Hochladen, Anzeigen und Verwalten von Bildern sowie deren Übertragung zwischen einem Server und mehreren Clients.

---

## Server
- Verarbeitet Datei-Uploads vom Client
- Unterstützt die Aktivierung von bis zu 4 Dateien gleichzeitig
- Stellt aktive Dateien für Clients bereit

---

## Client
- Lädt Bilder vom Server herunter
- Zeigt heruntergeladene Bilder in einer Galerie an
- Unterstützt Sortieren, Entfernen und Rückgängigmachen von Aktionen

---

## Features

### Server
- Benutzer-Login mit vordefinierten Anmeldedaten
- Hochladen von Dateien (.jpg, .png) in ein spezielles Upload-Verzeichnis
- Aktivieren von bis zu 4 Dateien gleichzeitig
- Netzwerkkommunikation, um aktive Dateien an Clients zu senden

### Client
- Anzeige heruntergeladener Bilder in einer Galerie
- Sortieren von Bildern nach Upload-Datum oder Alter
- Entfernen ausgewählter Bilder aus der Galerie
- Rückgängigmachen der letzten Entfernen-Aktion
- Kommunikation mit dem Server zur Bildübertragung

---

## Projektstruktur

### Server
- **ServerApp**: Hauptklasse des Servers. Verantwortlich für die Benutzeroberfläche und die Steuerung der Serverfunktionalität

### Client
- **ClientApp**: Hauptklasse des Clients. Enthält die gesamte Logik zur Anzeige und Verwaltung von Bildern sowie zur Kommunikation mit dem Server

---

## Verwendung

### Server
1. Starten Sie die **ServerApp**


### Client
1. Starten Sie die **ClientApp**

