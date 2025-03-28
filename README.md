<img width="1792" alt="Screenshot 2025-03-29 at 02 29 36" src="https://github.com/user-attachments/assets/b99eca80-b09c-4331-a8db-09a664ea2c14" /># News Mania: Read & Reflect






## 📌 Overview
News Mania is a React-based web application that allows users to browse top news headlines dynamically by selecting a country or a specific news category. The application integrates a **Spring Boot backend** for managing user notes, enabling users to save and delete notes related to the news they read.

---

## 🚀 Features

### 📰 **News Browsing**
- **By Country**: Click on a country’s card to view top news headlines from that region.
- **By Keyword/Category**: Select a category (e.g., Business, Sports, Technology) to fetch related news articles.
- **Real-time API Fetching**: Uses the **NewsAPI** to retrieve fresh news dynamically.
- **Popup Display**: News articles are displayed in a modal popup with direct links to read more.

### 📝 **Notes Management**
- **Create Notes**: Users can add notes related to news articles.
- **View & Delete Notes**: Previously saved notes can be viewed and deleted.
- **Spring Boot Backend Integration**: Notes are stored and managed via REST API calls.

---

## 🏗️ Technologies Used

### 🌐 **Frontend (React.js)**
- React (useState, useEffect) for managing state.
- React Bootstrap for UI components and styling.
- CSS for additional styling.

### 🔙 **Backend (Spring Boot)**
- Spring Boot REST API for managing notes (Create, Read, Delete operations).
- Spring Web for handling API requests.
- Database (H2 or MySQL) for storing user notes.

### 🔗 **APIs Used**
- **News API** (`https://newsapi.org`) for fetching news articles.
- **Custom Spring Boot API** (`http://localhost:8080/api`) for managing user notes.

---

## 📂 Project Structure
```
News-Mania/
│-- frontend/ (React App)
│   │-- src/
│   │   ├── components/
│   │   │   ├── NewsCards.js  # Displays news articles
│   │   │   ├── NotesSection.js  # Handles notes management
│   │   ├── styles/  # CSS files
│   │   ├── App.js  # Main component
│   │   ├── index.js  # React entry point
│   ├── public/
│-- backend/ (Spring Boot App)
│   │-- src/
│   │   ├── main/java/com/newsmania/
│   │   │   ├── controllers/  # API Controllers
│   │   │   ├── services/  # Business logic
│   │   │   ├── models/  # Data models
│   │   │   ├── repositories/  # Database interactions
│   │-- resources/
│   │   ├── application.properties  # Configurations
```

---

## 🛠️ Installation & Setup

### **🔹 Frontend (React) Setup**
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/news-mania.git
   cd news-mania/frontend
   ```
2. Install dependencies:
   ```sh
   npm install
   ```
3. Start the React app:
   ```sh
   npm start
   ```

### **🔹 Backend (Spring Boot) Setup**
1. Navigate to the backend directory:
   ```sh
   cd news-mania/backend
   ```
2. Build & run the application:
   ```sh
   mvn spring-boot:run
   ```
3. The backend will start on `http://localhost:8080`

---

## 🔗 API Endpoints

### **News API Integration**
- **Fetch News by Country**: `GET https://newsapi.org/v2/top-headlines?country={countryCode}&apiKey={API_KEY}`
- **Fetch News by Category**: `GET https://newsapi.org/v2/top-headlines?category={category}&apiKey={API_KEY}`

### **Spring Boot Notes API**
- **Get Notes**: `GET http://localhost:8080/api/notes`
- **Add Note**: `POST http://localhost:8080/api/submit` (JSON body: `{ "note": "Sample Note" }`)
- **Delete Note**: `DELETE http://localhost:8080/api/delete/{id}`

---

## 🎯 Future Enhancements
- ✅ Implement authentication for user-specific notes.
- ✅ Improve UI with animations and better responsiveness.
- ✅ Add a feature to filter news based on user preferences.
- ✅ Store news reading history for personalized recommendations.



