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

;Exercise 6: Implement this function:
;(prefix-of? candidate sequence): Both arguments are sequences. 
;Returns true if the elements in the candidate are the first elements in the sequence:

(defn prefix-of? [prefix sequence]
  (if (= (first prefix) (first sequence))
    (if (empty? (rest prefix))
      true
      (prefix-of? (rest prefix) (rest sequence)))
    false))

;Exercise 7: Implement this function:
;(tails sequence): Returns a sequence of successively smaller subsequences of the argument.

(defn rest-nth [sequence]
  true)

(defn tails [sequence]
  (if (empty? sequence)
  (drop 1 sequence)
  (cons sequence (tails (rest sequence)))))

;now n-queens



