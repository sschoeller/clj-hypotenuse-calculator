;;****************************************************************
;; Original Developer: Scott Schoeller (sschoellerSTEM); (C) 2018
;; License: Eclipse Public License - see "LICENSE" file
;;****************************************************************
(ns sschoellerstem.pythagorean.Main
  (:gen-class))

(defn calculate- [a b]
  "Pythagorean Theorem Calculator"
  
  (* a a)  
  (* b b)
  
  (Math/sqrt (+ a b))

)

(defn -main [& args]
  "Main"
  
  (println "Enter the length of the first side: ")  
  (def a (float (read-string (read-line))))
  
  (println "Enter the length of the second side: ")  
  (def b (float (read-string (read-line))))
  
  ;; TODO sides <= 0 can't form a valid right triangle
  (print "\nThe length of the hypotenuse is: ")  
  (calculate- a b)
)

(-main)
