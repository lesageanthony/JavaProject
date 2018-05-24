console.log(`I'm a silly entry point`);

import {$, jQuery} from 'jquery'

import 'bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css';

const arr = [1, 2, 3];
const iAmJavascriptES6 = () => console.log(...arr);
window.iAmJavascriptES6 = iAmJavascriptES6;
