import './style.css';
import Navbar from '../../components/Navbar'
import Header from '../../components/Header'
import Modalidades from '../../components/Modalidades'
import Beneficios from '../../components/Beneficios'
import Plans from '../../components/Plans'
import Evaluation from '../../components/Evaluation'
import Diferenciais from '../../components/Diferenciais'
import Loacalizao from '../../components/Loacalizao'
import Footer from '../../components/Footer'
import ToTop from '../../components/ToTop'

export default function Index() {
    
    return (
        <div>
            <img alt='whatsapp' className='whatsapp' src='https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/WhatsApp.svg/150px-WhatsApp.svg.png' />
            <ToTop />
            <Navbar />
            <Header />
            <Modalidades/>
            <Beneficios />
            <Diferenciais />
            <Plans />
            <Evaluation />
            <Loacalizao />
            <Footer />
        </div>
    );
}