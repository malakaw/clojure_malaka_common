(ns common-function.sort_joy)



(def plays [{:band "Burial",     :plays 979,  :loved 9}
            {:band "Eno",        :plays 2333, :loved 15}
            {:band "Bill Evans", :plays 979,  :loved 9}
            {:band "Magma",      :plays 2665, :loved 31}])


(defn columns [column-names]
  (fn [row]
    (vec (map row column-names))))

(def sort-by-loved-ratio (partial sort-by #(/ (:plays %) (:loved %))))

;;(sort-by :age [{:age 10} {:age 3} {:age 5}])
;;(sort-by (columns [:plays :loved :brand]) plays)
;;sort-by -> sort use para is vector ,,that's poition.
