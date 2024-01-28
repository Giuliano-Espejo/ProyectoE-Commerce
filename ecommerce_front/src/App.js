import { BrowserRouter, Route, Routes } from "react-router-dom";
import NavBar from "./componentes/NavBar";
import Productos from "./componentes/Productos";


function App() {
  return (
    <div className="App" >
      <BrowserRouter>
        <NavBar />
        <Routes>  
          <Route exact path="/" element={<Productos />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
