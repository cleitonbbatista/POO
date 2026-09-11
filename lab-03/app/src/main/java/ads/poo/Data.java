package ads.poo;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    
    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    public Data(int dia) {
        if (dia < 1 || dia > 31) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1970;
        } else {
            this.dia = dia;
            this.mes = 1;
            this.ano = 1970;
        }
    }

    public Data(int dia, int mes) {
        if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12) {
            if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (mes == 2 && dia > 29) {
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 1970;
                } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 1970;
                } else {
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = 1970;
                }
            } else {
                this.dia = dia;
                this.mes = mes;
                this.ano = 1970;
            }
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1970;
        }
    }

    public Data(int dia, int mes, int ano) {
        if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && ano > 0) {
            if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (mes == 2) {
                    if(ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                        if(dia > 29) {
                            this.dia = 1;
                            this.mes = 1;
                            this.ano = 1970;
                        } else {
                            this.dia = dia;
                            this.mes = mes;
                            this.ano = ano;
                        }
                    } else {
                        if(dia > 28) {
                            this.dia = 1;
                            this.mes = 1;
                            this.ano = 1970;
                        } else {
                            this.dia = dia;
                            this.mes = mes;
                            this.ano = ano;
                        }
                    }
                } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 1970;
                } else {
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;
                }
            } else {
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
            }
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1970;
        }
    }

    public boolean setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            if (this.mes == 2 || this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
                if (this.mes == 2) {
                    if(this.ano % 4 == 0 && (this.ano % 100 != 0 || this.ano % 400 == 0)) {
                        if(dia > 29) {
                            return false;
                        } else {
                            this.dia = dia;
                            return true;
                        }
                    } else {
                        if(dia > 28) {
                            return false;
                        } else {
                            this.dia = dia;
                            return true;
                        }
                    }
                } else if ((this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) && dia > 30) {
                    return false;
                } else {
                    this.dia = dia;
                    return true;
                }
            } else {
                this.dia = dia;
                return true;
            }
        } else {
            return false;
        }
    }

    public boolean setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
            return true;
        } else {
            return false;
        }
    }

    public boolean setAno(int ano) {
        if (ano >= 1) {
            this.ano = ano;
            return true;
        } else {
            return false;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public String dataExtenso() {
        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        return dia + " de " + meses[mes - 1] + " de " + ano;
    }

    public int diferencaDatas(Data outra) {
        int dias1 = this.ano * 365 + this.mes * 30 + this.dia;
        int dias2 = outra.ano * 365 + outra.mes * 30 + outra.dia;
        return Math.abs(dias1 - dias2);
    }

}