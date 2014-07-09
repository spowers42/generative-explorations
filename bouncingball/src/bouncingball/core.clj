(ns bouncingball.core
  (:gen-class)
  (:require [quil.core :as q]))

(def trail (atom []))
(def velocity (atom {}))
(def xsize 1000)
(def ysize (int(/ xsize 1.618)))

(defn setup[]
  (q/background 55)
  (swap! velocity {:x (- (rand-int 10) 5) :y (- (rand-int 10) 5)})

)

(defn draw[]
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println ysize)
  (q/sketch
    :setup setup
    :draw draw
    :title "bouncing ball with trail"
    :size [xsize ysize]
    :features [:exit-on-close]
  ))
