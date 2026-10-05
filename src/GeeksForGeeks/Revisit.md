# 🔁 SBC Revisit Tracker

![Total](https://img.shields.io/badge/Tracked-7-blue) ![Overdue](https://img.shields.io/badge/Overdue-0-red) ![Upcoming](https://img.shields.io/badge/Upcoming-7-brightgreen)

### 🏷️ Legend
🔴 Overdue · 🟢 Upcoming · 🆕 Stage 0 · 🔁 Stage 1 (+7d) · 📗 Stage 2 (+30d) · 🎓 Graduated (delete row) · ⚠️ Known bug

| Problem Name | Last Solved | Next Review | Status | Stage | Notes                                     |
|:---|:---:|:---:|:---:|:---:|:------------------------------------------|
| GFG: Triplet Sum in Array | 05-10-2026 | 12-10-2026 | 🟢 | 🔁 | Sort first, left = i + 1                  |
| GFG: Duplicates in Limited Range Array | 05-10-2026 | 12-10-2026 | 🟢 | 🔁 | Use Math.abs() to track visited indexes   |
| GFG: Move All Zeroes to End | 24-09-2026 | 01-10-2026 | 🟢 | 🆕 | Reader/Writer swap                        |
| GFG: Sort in specific order | 25-09-2026 | 02-10-2026 | 🟢 | 🆕 | Make odds negative, sort, revert          |
| GFG: Rotate Array | 25-09-2026 | 02-10-2026 | 🟢 | 🆕 | Left rotation: rev(0,d-1), rev(d,n-1), rev(all) |
| GFG: Count Distinct Elements in Every Window | 04-10-2026 | 11-10-2026 | 🟢 | 🔁 | Fixed-size window, track frequency map    |
| GFG: Max Sum Subarray of size K | 04-10-2026 | 11-10-2026 | 🟢 | 🆕 | Fixed-size window, curr - arr[left-1] + arr[right] |

---
### 🔄 How to update
1. Pick 🔴 rows from the top.
2. Re-solve from a blank file.
3. Clean solve → bump Stage (🆕→🔁→📗→🎓), Last Solved = today, push Next Review (+7d/+30d), flip to 🟢.
4. Shaky solve → keep Stage, just push Next Review out by the same interval.
5. 🎓 → delete the row.