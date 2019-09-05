var fs = require('fs');
function inconvinientEmail(name,email){
    const pos = email.indexOf("@");
    if(pos===-1)return true;
    const namePartOfEmail = email.substr(0, pos).toLowerCase();
    // console.log("name part",namePartOfEmail);
    return name.trim().toLowerCase().indexOf(namePartOfEmail)===-1;
}
fs.readFile('./1.0/upm.json', 'utf8', function(err, contents) {
    let seen=[];
    let json = JSON.parse(contents);
    json.profs.forEach(prof => {
        //console.log("prof",prof);
        let {name,email}=prof;
        let key = name.trim().toLowerCase();
        if(seen[key]){
            console.log("\x1b[41m",`Professor already listed ${JSON.stringify({name,email})}`);
            throw new Error(`Professor already listed`);
        }
        else if(inconvinientEmail(name,email)){
            //console.log(, stringToMakeYellow);  //yellow
            console.log('\x1b[33m%s\x1b[0m',`Inconvinient professor name,email combination ${JSON.stringify({name,email})}`);
        }
        seen[key]=true;
    });
    console.log("Processing complete");
});