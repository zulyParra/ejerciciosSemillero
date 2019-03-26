import { Injector } from "@angular/core";

export class GeneralServiciosObject {

    protected LogLevel = 20;

    constructor(protected injector:Injector) {
        if(this.isNpmServe()){
            this.logW("Se ha detectado angular local");
        }
    }

    /**
     * Verificia si el usuario actual tiene el rol indicado.
     * @param role el rol a comprobar
     */
    protected isUserInRole(role:string):boolean{
        return true;
    }

    protected isNpmServe():boolean{
        return location.port == "4200";
    }

    protected logD(msg: string, ...args: any[]) {
        this.log(0, msg, ...args);
    }

    protected logI(msg: string, ...args: any[]) {
        this.log(10, msg, ...args);
    }

    protected logW(msg: string, ...args: any[]) {
        this.log(20, msg, ...args);
    }

    protected logE(msg: string, ...args: any[]) {
        this.log(30, msg, ...args);
    }

    private log(level: number, msg: string, ...args: any[]) {
        if (level < this.LogLevel) {
            return;
        }
        let formatted = this.format(msg, ...args);

        let name = this.constructor.name;//nombre funcion
        if (name != "undefined")
            formatted = name + ": " + formatted;

        if (level < 10) console.debug(formatted);
        else if (level < 20) console.log(formatted);
        else if (level < 30) console.warn(formatted);
        else console.error(formatted);
    }

    private format(pattern: string, ...args: any[]) {
        if(args.length == 0) return pattern;
        return pattern.replace(/{(\d+)}/g, function (match, number) {
            return typeof args[number] != 'undefined' ? args[number] : match;
        });
    }
}