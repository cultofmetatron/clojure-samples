;objects


(def Point 
  (fn [x y]
    {:x x 
     :y y
     :__class_symbol__ 'Point
     }))

; a method for our point
(def x
  (fn [this] (:x this)))

(def shift
  (fn [this xinc yinc]
    (Point
      (+ xinc (:x this))
      (+ yinc (:y this)))))

(def class-symbol :__class_symbol__)

;Exercise 1: Implement add.
(def add
  (fn [this point2])
    (shift this
           (:x point2)
           (:y point2)))

(def make
  (fn [class-name & args]
    (apply class-name args)))












