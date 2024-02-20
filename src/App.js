import './App.css';
import Home from './pages/Home'
import Login from './pages/Login'
import Signup from './pages/Signup'
import NotFound from './pages/Error'
import Unitys from './pages/Unitys'
import Plan from './pages/plan'
import Modalities from './pages/modalities'
import { BrowserRouter, Routes, Route } from 'react-router-dom'

function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path='/entrar' element={<Login />}/>
                <Route path='/' element={<Home />} />
                <Route path='/cadastro' element={<Signup />} />
                <Route path='*' element={<NotFound />} />
                <Route path='/unidades' element={<Unitys />}/>
                <Route path='/modalidades' element={<Modalities />}/>
                <Route path='/planos' element={<Plan />}/>
            </Routes>
        </BrowserRouter>
    );
}

export default App;
