import XmlButton from '../XmlButton'
import './styles.css'
import DatePicker from "react-datepicker"
import "react-datepicker/dist/react-datepicker.css"
import { useEffect, useState } from 'react'
import axios from "axios"

function SalesCard() {

    const max = new Date();
    const min = new Date(new Date().setDate(new Date().getDate()-365));


    const [minDate, setMinDate] = useState(min);
    const [maxDate, setMaxDate] = useState(max);


    useEffect(()=>{
        axios.get("http://localhost:8080/empresaweb")
        .then(response =>{
            console.log(response.data)
        })
    },[]);

    return (
        <div className="dsmeta-card">
            <h2 className="dsmeta-sales-title">Arquivos XML</h2>
            <div>
                <div className="dsmeta-form-control-container">
                    <DatePicker
                        selected={minDate}
                        onChange={(date: Date) => { setMinDate(date)}}
                        className="dsmeta-form-control"
                        dateFormat="dd/MM/yyyy" />
                </div>
                <div className="dsmeta-form-control-container">
                    <DatePicker
                        selected={maxDate}
                        onChange={(date: Date) => { setMaxDate(date)}}
                        className="dsmeta-form-control"
                        dateFormat="dd/MM/yyyy" />
                </div>

                <div>
                    <table className="dsmeta-sales-table">
                        <thead>
                            <tr>
                                <th className="show">Chave de Acesso</th>
                                <th>Data de emissão</th>
                                <th>Número</th>
                                <th>Série</th>
                                <th>Modelo</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td className="show">29220613635723000109650010000404969000542497</td>
                                <td>Chave de Acesso</td>
                                <td>0014736982</td>
                                <td>001</td>
                                <td>NFC-e</td>
                                <td>
                                    <div className="dsmeta-red-btn-container">
                                        <XmlButton />
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td className="show">29220613635723000109650010000404969000542497</td>
                                <td>Chave de Acesso</td>
                                <td>0022252575</td>
                                <td>001</td>
                                <td>NFC-e</td>
                                <td>
                                    <div className="dsmeta-red-btn-container">
                                        <XmlButton />
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td className="show">29220613635723000109650010000404969000542497</td>
                                <td>Chave de Acesso</td>
                                <td>0011225545</td>
                                <td>001</td>
                                <td>NFC-e</td>
                                <td>
                                    <div className="dsmeta-red-btn-container">
                                        <XmlButton />
                                    </div>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>

            </div>
        </div>
    )
}
export default SalesCard