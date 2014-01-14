(defn hello [x] (+ x 6) )
(def twice (fn [n] (+ n n)))

(defn mymap [func & args]
  (if (empty? args)
  '()
  (cons (func (first args)) (apply mymap (cons func (rest args)) ))))


(+ 5 7 5)
(+ 4 8 2)

;Exercise 3: Implement add-squares. user=> (add-squares 1 2 5)
(defn square [n] (* n n))

(defn add-squares [ & args]
  (apply + (map square args)))

;Exercise 4: The range function produces a sequence of numbers:
(defn ranger [i n sequence]
  (if (> i n)
    sequence
    (ranger (+ i 1) n (cons i sequence))))

(defn my-range [i n]
  (reverse (ranger i n '())))

(defn factorial [n]
  (apply * (my-range 1 n)))

;Exercise 5: Below, I give a list of functions that work on lists
; or vectors. For each one, think of a problem it could solve, and solve it.


