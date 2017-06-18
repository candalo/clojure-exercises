(defn read-number []
  (do
    (print "Enter a number: ")
    (flush)
    (read-line)))

(def n1 (read-string (read-number)))
(def n2 (read-string (read-number)))
(def result (+ n1 n2))
(println (str "Sum = " result))
