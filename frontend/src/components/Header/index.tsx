import logo from '../../assets/img/logo.png'

import './styles.css'

function header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="Confiança Sistemas" />
                    <h1>Portal de XML</h1>
                    <p>Desenvolvido pela Confiança Sistemas</p>
            </div>
        </header>
    )
}

export default header
