(ns kata-are-they-the-same.kata-are-they-the-same)

(defn compSame [a b]
  (if (or (empty? a) (empty? b))
    false
    (= (map #(* % %) (sort a)) (sort b))))
