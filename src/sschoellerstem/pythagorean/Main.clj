;;**************************************************************************
;; Original Developer: Scott Schoeller (sschoellerSTEM); Copyright (C) 2018
;; License: Eclipse Public License, v2.0 - see "LICENSE" file
;;**************************************************************************
(ns sschoellerstem.pythagorean.Main
  (:gen-class))

(defn calculate- [a b]
  "Pythagorean Theorem Calculator"
  (print "\nThe length of the hypotenuse is: ")
  (Math/sqrt (+ (* a a) (* b b))
  )

)

(defn -main [& args]
  "Main"
  
  (println "Enter the length of the first side: ")  
  (def a (float (read-string (read-line)))
    )
  
  (println "Enter the length of the second side: ")  
  (def b (float (read-string (read-line)))
  )
  
  (if (and (> a 0.0) (> b 0.0))  
      (calculate- a b)
      (print "Invalid side(s)!")
  )
)

(-main)
