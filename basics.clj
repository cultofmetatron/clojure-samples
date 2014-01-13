(defn hello [x] (+ x 6) )
(def twice (fn [n] (+ n n)))

(defn mymap [func args]
  (if (empty? args)
  '()
  (cons (func (first args)) (mymap func (rest args)))))


(+ 5 7 5)
(+ 4 8 2)


