
@RequestMapping("/camiones")
@RestController
public class CamionesControllers {
    @Autowired
    CamionesService camionesService;


    @GetMapping
    public ResponseEntity<List<Camion>> listar(){
        List<Camion> choferes = this.camionesService.getAll();
        if(choferes.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        else{
            return ResponseEntity.ok(choferes);
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable(name="id") Long id){
        Optional<Camion> c = camionesService.findById(id);
        if(c.isPresent()){
            return ResponseEntity.ok(c.get());
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }  


    @PostMapping
    public ResponseEntity<?> post(@RequestBody Camion c){
        Camion save = camionesService.save(c);
        return ResponseEntity.status(HttpStatus.CREATED).body(save);
    }





}
