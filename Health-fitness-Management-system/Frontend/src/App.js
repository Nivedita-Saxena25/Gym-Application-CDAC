import './App.css';
import Home from './pages/Home';
import Login from './pages/Login';
import Signup from './pages/Signup';
import NotFound from './pages/Error';
import AboutUs from './pages/aboutus'; // Corrected component name
import Facilities from './pages/facilities'; // Corrected component name
import Plan from './pages/plan';
import OTP from './pages/otpform'; // Corrected component name
import BMIcalculator from './pages/BMIcalculator'; 
import { BrowserRouter, Routes, Route } from 'react-router-dom';

function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path='/login' element={<Login />} />
                <Route path='/' element={<Home />} />
                <Route path='/signup' element={<Signup />} />
                <Route path='/aboutus' element={<AboutUs />} /> {/* Corrected component name */}
                <Route path='/facilities' element={<Facilities />} />
                <Route path='/BMIcalculator' element={<BMIcalculator />} />
                <Route path='/plans' element={<Plan />} />
                <Route path='/otpverify' element={<OTP/>} />
                <Route path='*' element={<NotFound />} />
              
            </Routes>
        </BrowserRouter>
    );
}

export default App;
