(defn number-input []
  (def n (read-line)))

(defn show-message []
  (println (str "The number entered was " n)))

(number-input)
(show-message)
